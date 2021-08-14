package ru.russeva.web.dao;

import ru.russeva.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUserById(long id);

    void removeUser(long id);


}
