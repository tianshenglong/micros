package com.study.microsvehicle.feign.hystrix;

import com.study.microsvehicle.feign.HelloService;
import org.springframework.stereotype.Component;

/**
 * <p>Description  HelloServiceFallBack</p>
 *
 * @author tianshenglong
 * @date 2020/12/9 16:12
 * @return
 */
@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hi(String name) {
        return " fall back. " + name;
    }
}
