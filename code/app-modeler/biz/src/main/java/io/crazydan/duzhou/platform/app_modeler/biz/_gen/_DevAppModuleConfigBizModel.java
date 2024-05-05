package io.crazydan.duzhou.platform.app_modeler.biz._gen;

import io.nop.biz.crud.CrudBizModel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevAppModuleConfig;

public class _DevAppModuleConfigBizModel extends CrudBizModel<DevAppModuleConfig> {
    private final Logger log = LoggerFactory.getLogger(getClass());

    public _DevAppModuleConfigBizModel() {
        setEntityName(DevAppModuleConfig.class.getName());
    }

    public Logger log() {
        return this.log;
    }
}
