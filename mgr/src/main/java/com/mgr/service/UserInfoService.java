package com.mgr.service;

import com.mgr.dao.UserInfoDao;
import com.mgr.dto.User;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class UserInfoService {

    @Setter(onMethod = @__({@Autowired}))
    private UserInfoDao userInfoDao;

    public ArrayList<User> getAll() throws SQLException {
        return userInfoDao.getAll();
    }

    public User getOne(User user) throws SQLException {
        return userInfoDao.getOne(user);
    }

    public boolean updateUser(User user) throws SQLException {
        return userInfoDao.updateUser(user);
    }

    public boolean insertUser(User user) throws SQLException {
        return userInfoDao.insertUser(user);
    }

    public void deleteUser(String name) throws SQLException {
        userInfoDao.deleteUser(name);
    }

}