package ru.russeva.web.service;

import ru.russeva.web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getUsers();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUserById(long id);

    public void removeUser(long id);




}
