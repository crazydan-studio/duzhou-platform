package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppEntityColumn;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.crazydan.duzhou.framework.commons.StringHelper.snakeCase;

@BizObjName("DevAppEntityColumn")
public class DevAppEntityColumn extends _DevAppEntityColumn {

    /** 字段名采用 snake-case（全部大写） */
    @Override
    public void setName(String value) {
        super.setName(snakeCase(value, true));
    }
}
