package io.crazydan.duzhou.platform.app_modeler.biz._gen;

import io.nop.biz.crud.CrudBizModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntity;

public class _DevAppEntityBizModel extends CrudBizModel<DevAppEntity> {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public _DevAppEntityBizModel() {
        setEntityName(DevAppEntity.class.getName());
    }

    public Logger log() {
        return this.log;
    }
}
