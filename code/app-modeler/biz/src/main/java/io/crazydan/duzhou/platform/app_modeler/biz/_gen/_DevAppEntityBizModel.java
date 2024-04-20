package io.crazydan.duzhou.platform.app_modeler.biz._gen;

import io.nop.api.core.annotations.biz.BizModel;
import io.nop.biz.crud.CrudBizModel;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity;

public class _DevAppEntityBizModel extends CrudBizModel<DevAppEntity> {

    public _DevAppEntityBizModel() {
        setEntityName(DevAppEntity.class.getName());
    }
}
