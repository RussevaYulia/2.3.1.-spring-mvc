package ru.russeva.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.russeva.web.dao.UserDao;
import ru.russeva.web.model.User;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public void saveUser(User user) {
        this.userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        this.userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void removeUser(long id) {
        this.userDao.removeUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(long id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
