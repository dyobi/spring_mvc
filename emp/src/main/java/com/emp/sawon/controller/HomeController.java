package com.emp.sawon.controller;

import com.emp.sawon.service.SawonService;
import com.emp.sawon.vo.SawonVo;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @Setter(onMethod = @__({@Autowired}))
    private SawonService sawonService;

    @RequestMapping(value = "/sawonAll.do")
    public String sawonAll(Model model) throws Exception {
        ArrayList<SawonVo> arr = sawonService.getAllSawon();

        model.addAttribute("arr", arr);
        return "sawonAll";
    }

}
