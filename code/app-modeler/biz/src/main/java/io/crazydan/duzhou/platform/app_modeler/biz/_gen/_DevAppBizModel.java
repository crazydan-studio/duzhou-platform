package io.crazydan.duzhou.platform.app_modeler.biz._gen;

import io.nop.api.core.annotations.biz.BizModel;
import io.nop.biz.crud.CrudBizModel;

import io.crazydan.duzhou.platform.app_modeler.orm.entity.DevApp;

public class _DevAppBizModel extends CrudBizModel<DevApp> {

    public _DevAppBizModel() {
        setEntityName(DevApp.class.getName());
    }
}
