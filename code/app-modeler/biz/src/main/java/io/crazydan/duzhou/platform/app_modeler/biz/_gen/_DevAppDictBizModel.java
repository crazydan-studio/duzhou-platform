package io.crazydan.duzhou.platform.app_modeler.biz._gen;

import io.nop.biz.crud.CrudBizModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppDict;

public class _DevAppDictBizModel extends CrudBizModel<DevAppDict> {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public _DevAppDictBizModel() {
        setEntityName(DevAppDict.class.getName());
    }

    public Logger log() {
        return this.log;
    }
}
