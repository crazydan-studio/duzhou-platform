package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.nop.api.core.annotations.biz.BizObjName;
import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppEntity;


@BizObjName("DevAppEntity")
public class DevAppEntity extends _DevAppEntity{
    private long columnSize;

    public long getColumnSize() {
        return this.columnSize;
    }

    public void setColumnSize(long columnSize) {
        this.columnSize = columnSize;
    }
}
