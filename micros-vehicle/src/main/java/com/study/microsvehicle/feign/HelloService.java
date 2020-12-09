package com.study.microsvehicle.feign;


import com.study.microsvehicle.feign.hystrix.HelloServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "micros-user",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @GetMapping(value = "/")
    String hi(@RequestParam(value = "name") String name);
}
