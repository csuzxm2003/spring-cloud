package com.cloud.auth.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.auth.entity.User;
import com.cloud.auth.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Description: 用户控制器类
 * FileName: UserController
 * Author:   ZhaoXiaoman
 * Date:     2019/2/18 17:04
 * History:
 * <author>          <time>          <version>          <desc>
 * Zhao Xiaoman      2019/2/18 17:04    1.0
 * 版权:   版权所有(C)2019
 * 公司:   东华云计算有限公司
 */
@RequestMapping(value = "/user")
@RestController
public class UserController extends Base{
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(){
        //取得请求参数
        Map<String, String[]> reqMap = new HashMap<>(super.getParameterMap());
        LOG.info("======用户登陆请求参数：{}", JSON.toJSONString(reqMap));
        //中信实例id，必需
        Long id  = reqMap.get("id") == null ? 0L: Long.parseLong(reqMap.get("id")[0]);
        if(id == 0){
            return new User();
        }
        return userService.findUserById(id);
    }
}
