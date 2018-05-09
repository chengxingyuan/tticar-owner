package com.czy.tticar.owner.controller;

import com.czy.tticar.owner.common.base.BaseController;
import com.czy.tticar.owner.common.base.BaseResponse;
import com.czy.tticar.owner.model.User;
import com.czy.tticar.owner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chengxy
 * @date 2018/5/9 10:28
 */
@RestController
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    /**
     * 根据用户id查询用户详细信息
     * */
    @PostMapping("/queryUserById")
    public BaseResponse<User> queryUserById(Long id){
        logger.info("入参id是{}",id);
        if (id == null) {
            return paramCanNotIsNull();
        }
        User user = userService.queryUserById(id);
        return successResponse(user);
    }
}
