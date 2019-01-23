package com.cloud.client.user.controller;

import com.cloud.client.user.entity.User;
import com.cloud.client.user.feign.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        String json = "{\"name\":\"zhangsan\",\"age\":19}";
        User user = this.userFeignClient.findById(id);
        return user;

    }
}
