package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevApp;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.crazydan.duzhou.framework.commons.StringHelper.snakeCase;

@BizObjName("DevApp")
public class DevApp extends _DevApp {

    @Override
    public void setCode1(String value) {
        super.setCode1(snakeCase(value));
    }

    @Override
    public void setCode2(String value) {
        super.setCode2(snakeCase(value));
    }
}
