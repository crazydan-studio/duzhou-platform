package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppEntity;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.crazydan.duzhou.framework.commons.StringHelper.snakeCase;

@BizObjName("DevAppEntity")
public class DevAppEntity extends _DevAppEntity {
    private long columnSize;

    /** 表名采用 snake-case（全部小写） */
    @Override
    public void setTableName(String value) {
        super.setTableName(snakeCase(value));
    }

    public long getColumnSize() {
        return this.columnSize;
    }

    public void setColumnSize(long columnSize) {
        this.columnSize = columnSize;
    }
}
