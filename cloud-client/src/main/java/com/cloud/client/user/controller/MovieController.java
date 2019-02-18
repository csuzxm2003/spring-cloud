package com.cloud.client.user.controller;

import com.cloud.client.user.entity.User;
import com.cloud.client.user.feign.UserFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;
    private static final Logger LOG = LoggerFactory.getLogger(MovieController.class);

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        LOG.info("查找ID=" + id + "的用户信息！");
        String json = "{\"name\":\"zhangsan\",\"age\":19}";
        User user = this.userFeignClient.findById(id);
        return user;

    }
}
