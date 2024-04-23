/*
 * 渡舟平台 - 致力于构建自运维、自监控、可演化的全功能型应用平台
 * Copyright (C) 2024 Crazydan Studio <https://studio.crazydan.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.
 * If not, see <https://www.gnu.org/licenses/lgpl-3.0.en.html#license-text>.
 */

package io.crazydan.duzhou.framework.app_modeler.test.biz;

import java.util.HashMap;

import io.crazydan.duzhou.framework.junit.NopJunitTestCase;
import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp;
import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule;
import io.nop.api.core.annotations.autotest.NopTestConfig;
import io.nop.core.lang.eval.IEvalAction;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.core.lang.json.JsonTool;
import io.nop.core.resource.component.ResourceComponentManager;
import io.nop.dao.api.IDaoProvider;
import io.nop.orm.model.OrmModel;
import io.nop.xlang.api.XLang;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:flytreeleft@crazydan.org">flytreeleft</a>
 * @date 2024-04-21
 */
@NopTestConfig(enableActionAuth = "false", initDatabaseSchema = true,
               testConfigFile = "classpath:/application.properties")
public class OrmModelGenTest extends NopJunitTestCase {
    @Inject
    protected IDaoProvider daoProvider;

    @Test
    public void test_GenOrmModel() {
        IEvalAction eval = XLang.getTagAction("/duzhou/xlib/app-modeler.xlib", "GenOrmModel");

        IEvalScope scope = XLang.newEvalScope();
        scope.setLocalValue("devAppModule", new HashMap<>());

        OrmModel ormModel = (OrmModel) eval.invoke(scope);
        this.log.info("app-modeler.test.gen.orm-model={}", ormModel.prop_get("ext:mavenArtifactId"));
    }

    @Test
    public void test_PatchDevAppModule() {
        DevApp devApp = this.daoProvider.newEntity(DevApp.class);
        DevAppModule devAppModule = this.daoProvider.newEntity(DevAppModule.class);
        OrmModel ormModel = (OrmModel) ResourceComponentManager.instance()
                                                               .loadComponentModel("/OrmModelGenTest/app.orm.xml");

        IEvalAction eval = XLang.getTagAction("/duzhou/xlib/app-modeler.xlib", "PatchDevAppModule");

        IEvalScope scope = XLang.newEvalScope();
        scope.setLocalValue("devApp", devApp);
        scope.setLocalValue("devAppModule", devAppModule);
        scope.setLocalValue("ormModel", ormModel);

        eval.invoke(scope);
        this.log.info("app-modeler.test.patch.dev-app-module={},{}",
                      JsonTool.stringify(devApp.prop_names()),
                      JsonTool.stringify(devAppModule.prop_names()));
    }
}
