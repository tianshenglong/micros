package com.study.microsuser.service.impl;

import com.study.microsuser.mapper.PnUserMapper;
import com.study.microsuser.model.PnUser;
import com.study.microsuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Description  UserService</p>
 *
 * @author tianshenglong
 * @date 2020/8/25 16:54
 * @return
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private PnUserMapper userMapper;

    @Override
    public PnUser getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

}
