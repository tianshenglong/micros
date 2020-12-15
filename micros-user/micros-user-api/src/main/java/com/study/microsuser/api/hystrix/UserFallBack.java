package com.study.microsuser.api.hystrix;

import com.study.microsuser.api.feign.UserFeignService;
import com.study.microsuser.model.PnUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>Description  UserFallBack</p>
 *
 * @author tianshenglong
 * @date 2020/12/14 16:39
 * @return
 */
@Component
@Slf4j
public class UserFallBack implements UserFeignService {
    @Override
    public PnUser findById(Integer userId) {
        PnUser user = new PnUser();
        user.setName("找不到人");
        return user;
    }
}
