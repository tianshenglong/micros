package com.study.microsvehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * <p>Description  HelloController</p>
 *
 * @author tianshenglong
 * @date 2020/12/9 14:46
 * @return
 */

@RestController
public class HelloController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public String hi(String name){
        //这里直接写的是服务名： micros-user  。在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
        return restTemplate.getForObject("http://micros-user?name=" + name, String.class);
    }
}
