package com.study.microsuser.service;

import com.study.microsuser.model.PnUser;

/**
 * <p>Description  UserService</p>
 *
 * @author tianshenglong
 * @date 2020/12/14 16:45
 * @return
 */
public interface UserService {

    PnUser getUserById(Integer userId);
}
