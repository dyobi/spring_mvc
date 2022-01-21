package com.mgr.controller;

import com.mgr.dto.User;
import com.mgr.service.UserInfoService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;

@Controller
public class UserInfoController {

    @Setter(onMethod = @__({@Autowired}))
    private UserInfoService userInfoService;

    @RequestMapping("/getAll.do")
    public String getAll(Model model) throws SQLException {
        model.addAttribute("users", userInfoService.getAll());
        return "userInfo/getAll";
    }

    @RequestMapping("/getOne.do")
    public String getOne(User user, Model model) throws SQLException {
        model.addAttribute("user", userInfoService.getOne(user));
        return "userInfo/getOne";
    }

    @RequestMapping("/updateUser.do")
    public String updateUser(User user) throws SQLException {
        if (userInfoService.updateUser(user)) {
            return "redirect:getAll.do";
        } else {
            return "redirect:getOne.do?id=" + user.getId() + "&name=" + user.getName() + "&tel=" + user.getTel();
        }
    }

    @RequestMapping("/insertUserPage.do")
    public String insertUserPage() {
        return "userInfo/insertUser";
    }

    @PostMapping("/insertUser.do")
    public String insertUser(User user) throws SQLException {
        if (userInfoService.insertUser(user)) {
            return "redirect:getAll.do";
        } else {
            return "userInfo/insertUser";
        }
    }

    @RequestMapping("/deleteUser.do")
    public String deleteUser(@RequestParam("name") String name) throws SQLException {
        userInfoService.deleteUser(name);
        return "redirect:getAll.do";
    }
}