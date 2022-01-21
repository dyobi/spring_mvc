package com.mgr.service;

import com.mgr.dao.AuthDao;
import com.mgr.dto.Auth;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class AuthService {

    @Setter(onMethod = @__({@Autowired}))
    private AuthDao authDao;

    public String authLogin(Auth auth) throws SQLException {
        if (authDao.authLogin(auth)) {
            return "userInfo/index";
        } else {
            return "auth/authLogin";
        }
    }

}
