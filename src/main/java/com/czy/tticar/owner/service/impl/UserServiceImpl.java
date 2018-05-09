package com.czy.tticar.owner.service.impl;

import com.czy.tticar.owner.mapper.UserMapper;
import com.czy.tticar.owner.model.User;
import com.czy.tticar.owner.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chengxy
 * @date 2018/5/9 10:28
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUserById(Long id) {
        return userMapper.queryUserById(id);
    }
}
