package io.crazydan.duzhou.platform.app_modeler.biz._gen;

import io.nop.biz.crud.CrudBizModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppEntityRelation;

public class _DevAppEntityRelationBizModel extends CrudBizModel<DevAppEntityRelation> {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public _DevAppEntityRelationBizModel() {
        setEntityName(DevAppEntityRelation.class.getName());
    }

    public Logger log() {
        return this.log;
    }
}
