package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppDomain;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.nop.commons.util.StringHelper.camelCase;

@BizObjName("DevAppDomain")
public class DevAppDomain extends _DevAppDomain {

    @Override
    public void setName(String value) {
        super.setName(value.replaceAll("\\s+", "-"));
    }
}
