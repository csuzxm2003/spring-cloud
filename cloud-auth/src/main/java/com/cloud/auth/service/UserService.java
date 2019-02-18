package com.cloud.auth.service;

import com.cloud.auth.entity.User;

/**
 * Description: 用户业务类
 * FileName: UserService
 * Author:   ZhaoXiaoman
 * Date:     2019/2/18 16:56
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/2/18 16:56    1.0
 * 版权:   版权所有(C)2018
 * 公司:   东华云计算有限公司
 */

public interface UserService {
    /**
    * @Author ZhaoXiaoman
    * @Description 根据ID查找用户信息
    * @Date 17:01 2019/2/18
    * @Param [id]
    * @Return com.cloud.auth.entity.User
    */
    public User findUserById(Long id);
}
