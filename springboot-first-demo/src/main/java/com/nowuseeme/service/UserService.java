package com.nowuseeme.service;

import com.nowuseeme.entity.UserEntity;

import java.util.List;


public interface UserService {
    void add(UserEntity user);
    List<UserEntity> getAll();
}
