package io.crazydan.duzhou.platform.app_modeler.biz;

import io.nop.api.core.exceptions.ErrorCode;

import static io.nop.api.core.exceptions.ErrorCode.define;

/** 业务{@link io.nop.api.core.exceptions.ErrorCode 错误信息}定义 */
public interface AppModelerBizErrors {

    ErrorCode Err_DevAppModule_No_App_Exist = define("nop.err.biz.DevAppModule.no-app-exist",
                                                     "未指定所属应用或指定的应用不存在");
}
