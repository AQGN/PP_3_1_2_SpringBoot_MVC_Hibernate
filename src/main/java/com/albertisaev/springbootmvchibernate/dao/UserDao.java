package com.albertisaev.springbootmvchibernate.dao;

import com.albertisaev.springbootmvchibernate.model.User;
import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Long id);

    void updateUser(User user);

    void deleteUser(Long id);
}
