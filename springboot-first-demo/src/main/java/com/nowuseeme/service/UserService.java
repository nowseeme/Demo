package com.nowuseeme.service;
import com.nowuseeme.entity.UserEntity;
import com.sun.tools.javac.util.List;


public interface UserService {
    void add(UserEntity user);
    List<UserEntity> getAll();
}
