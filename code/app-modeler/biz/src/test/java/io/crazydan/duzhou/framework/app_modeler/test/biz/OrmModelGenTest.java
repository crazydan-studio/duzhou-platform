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
import io.nop.api.core.annotations.autotest.NopTestConfig;
import io.nop.core.lang.eval.IEvalAction;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.orm.model.OrmModel;
import io.nop.xlang.api.XLang;
import org.junit.jupiter.api.Test;

/**
 * @author <a href="mailto:flytreeleft@crazydan.org">flytreeleft</a>
 * @date 2024-04-21
 */
@NopTestConfig(enableActionAuth = "false", initDatabaseSchema = true,
               testConfigFile = "classpath:/application.properties")
public class OrmModelGenTest extends NopJunitTestCase {

    @Test
    public void test_Gen_OrmModel() {
        IEvalAction eval = XLang.getTagAction("/duzhou/xlib/app-modeler.xlib", "GenOrmModel");

        IEvalScope scope = XLang.newEvalScope();
        scope.setLocalValue("devAppModule", new HashMap<>());

        OrmModel ormModel = (OrmModel) eval.invoke(scope);
        this.log.info("app-modeler.test.gen.orm-model={}", ormModel.prop_get("ext:mavenArtifactId"));
    }
}
