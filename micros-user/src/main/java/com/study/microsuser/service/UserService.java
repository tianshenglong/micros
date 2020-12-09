package com.study.microsuser.service;

import com.study.microsuser.mapper.PnUserMapper;
import com.study.microsuser.model.PnUser;
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
public class UserService {

    @Autowired
    private PnUserMapper userMapper;

    public PnUser getUserById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

}
