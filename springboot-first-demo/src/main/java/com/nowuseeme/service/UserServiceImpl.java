package com.nowuseeme.service;

import com.nowuseeme.dao.UserEntityMapper;
import com.nowuseeme.entity.UserEntity;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserEntityMapper userEntityMapper;


    @Override
    public void add(UserEntity user) {
        userEntityMapper.insert(user);
    }

    @Override
    public List<UserEntity> getAll() {
        return userEntityMapper.selectAll();
    }
}
