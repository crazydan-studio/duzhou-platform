package io.crazydan.duzhou.platform.app_modeler.biz;

import java.io.File;

import io.crazydan.duzhou.platform.app_modeler.biz._gen._DevAppModuleBizModel;
import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp;
import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModule;
import io.nop.api.core.annotations.biz.BizModel;
import io.nop.api.core.annotations.biz.BizMutation;
import io.nop.api.core.annotations.core.Name;
import io.nop.codegen.XCodeGenerator;
import io.nop.commons.util.FileHelper;
import io.nop.core.lang.eval.IEvalScope;
import io.nop.xlang.api.XLang;

/** {@link DevAppModule} 的业务处理模型 */
@BizModel("DevAppModule")
public class DevAppModuleBizModel extends _DevAppModuleBizModel {

    @BizMutation
    public void release(@Name("id") String id, @Name("releaseDir") String releaseDir) throws Exception {
        DevAppModule service = dao().getEntityById(id);
        dao().batchLoadPropsForEntity(service,
                                      "app,entities"
                                      + ",entities.columns,entities.relations"
                                      + ",entities.relations.source,entities.relations.target");
        DevApp app = service.getApp();

        FileHelper.assureParent(new File(releaseDir, "/any"));

        XCodeGenerator gen = new XCodeGenerator("/duzhou/templates/app-modeler", releaseDir);

        IEvalScope scope = XLang.newEvalScope();
        scope.setLocalValue("app", app);
        scope.setLocalValue("service", service);

        gen.execute("/", scope);
    }
}
