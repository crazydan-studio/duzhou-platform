package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppModule;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.crazydan.duzhou.framework.commons.StringHelper.snakeCase;

@BizObjName("DevAppModule")
public class DevAppModule extends _DevAppModule {

    /** 模块编码采用 snake-case（全部小写） */
    @Override
    public void setCode(String value) {
        super.setCode(snakeCase(value));
    }
}
