package io.crazydan.duzhou.platform.app_modeler.orm.entity;

import io.crazydan.duzhou.platform.app_modeler.orm.entity._gen._DevAppDict;
import io.nop.api.core.annotations.biz.BizObjName;

import static io.crazydan.duzhou.framework.commons.StringHelper.snakeCase;

@BizObjName("DevAppDict")
public class DevAppDict extends _DevAppDict {

    /** 字典名采用 snake-case（全部小写），并使用短横线分隔 */
    @Override
    public void setName(String value) {
        super.setName(snakeCase(value, false, true));
    }
}
