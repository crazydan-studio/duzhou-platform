package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppEntityRelation;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.crazydan.duzhou.framework.commons.StringHelper.snakeCase;

@BizObjName("DevAppEntityRelation")
public class DevAppEntityRelation extends _DevAppEntityRelation {

    /** 中间表名采用 snake-case（全部大写） */
    @Override
    public void setTableName(String value) {
        super.setTableName(snakeCase(value, true));
    }
}
