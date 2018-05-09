package com.czy.tticar.owner.mapper;

import com.czy.tticar.owner.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author chengxy
 * @date 2018/5/9 10:30
 */
@Repository
public interface UserMapper {
    /**
     * 根据id查询用户详细信息
     * @param id 用户id
     * @return 用户详细信息
     * */
    User queryUserById(Long id);
}
