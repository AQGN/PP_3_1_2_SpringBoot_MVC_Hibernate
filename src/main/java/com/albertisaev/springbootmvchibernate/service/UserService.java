package com.albertisaev.springbootmvchibernate.service;

import com.albertisaev.springbootmvchibernate.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
