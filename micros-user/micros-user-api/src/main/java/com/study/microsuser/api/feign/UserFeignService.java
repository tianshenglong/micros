package com.study.microsuser.api.feign;

import com.study.microsuser.api.hystrix.UserFallBack;
import com.study.microsuser.model.PnUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>Description  UserService</p>
 *
 * @author tianshenglong
 * @date 2020/12/12 19:19
 * @return
 */
@FeignClient(name = "micros-user", fallback = UserFallBack.class)
public interface UserFeignService {

    @GetMapping("/v1/users/{userId}")
    PnUser findById(@PathVariable(value = "userId") Integer userId);
}
