package com.cloud.auth.service.impl;

import com.cloud.auth.entity.User;
import com.cloud.auth.mapper.UserMapper;
import com.cloud.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 用户业务实现类
 * FileName: UserServiceImpl
 * Author:   ZhaoXiaoman
 * Date:     2019/2/18 16:59
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/2/18 16:59    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * @param id
     * @Author ZhaoXiaoman
     * @Description 根据ID查找用户信息
     * @Date 17:01 2019/2/18
     * @Param [id]
     * @Return com.cloud.auth.entity.User
     */
    @Override
    public User findUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
