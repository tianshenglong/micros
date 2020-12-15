package com.study.microsuser.controller;

import com.study.microsuser.ApiResult;
import com.study.microsuser.model.PnUser;
import com.study.microsuser.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Description  UserController</p>
 *
 * @author tianshenglong
 * @date 2020/8/25 16:58
 * @return
 */

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Resource(name = "userService")
    private UserServiceImpl userService;

    @GetMapping("/{id}")
    public PnUser findById(@PathVariable("id") Integer id){
        return userService.getUserById(id);
    }
}
