package com.czy.tticar.owner.common.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author chengxy
 * @date 2018/5/9 10:22
 */

public class BaseController {
    /**
     * 日志记录器
     */
    protected Logger logger = LoggerFactory.getLogger(BaseController.class);

    protected static BaseResponse response = new BaseResponse();

    /**
     * 操作成功
     * */
    protected static BaseResponse successResponse() {
        response.setCode(ResponseCodes.SUCCESS.getCode());
        response.setMessage(ResponseCodes.SUCCESS.getMessage());
        return response;
    }

    /**
     * 操作成功,同时返回查询到的数据
     * */
    protected static BaseResponse successResponse(Object data) {
        response.setCode(ResponseCodes.SUCCESS.getCode());
        response.setMessage(ResponseCodes.SUCCESS.getMessage());
        response.setData(data);
        return response;
    }

    /**
     * 参数为空
     * */
    protected static BaseResponse paramCanNotIsNull(){
        response.setCode(ResponseCodes.ParamCanNotIsNull.getCode());
        response.setMessage(ResponseCodes.ParamCanNotIsNull.getMessage());
        return response;
    }
}
