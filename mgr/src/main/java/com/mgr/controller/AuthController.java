package com.mgr.controller;

import com.mgr.dto.Auth;
import com.mgr.service.AuthService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class AuthController {

    @Setter(onMethod = @__({@Autowired}))
    private AuthService authService;

    @RequestMapping("/authLoginPage.do")
    public String authLoginPage() {
        return "auth/authLogin";
    }

    @PostMapping("/authLogin.do")
    public String authLogin(Auth auth) throws SQLException {
        return authService.authLogin(auth);
    }

    @RequestMapping("/authJoinPage.do")
    public String authJoinPage() {
        return "auth/authJoin";
    }

}
