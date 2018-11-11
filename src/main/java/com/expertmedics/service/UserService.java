package com.expertmedics.service;

import java.util.List;

import com.expertmedics.model.User;
import com.expertmedics.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);

    User findById(Long id);
}
