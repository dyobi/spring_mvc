package com.demo.untitled.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        return "index2";
    }

    @RequestMapping(value = "/calculate.do", method = RequestMethod.POST)
    public String kaja(Model model,
                       @RequestParam("name")String name,
                       @RequestParam("jumsoo")String jumsoo
    ) {
        model.addAttribute("name", name);
        model.addAttribute("jumsoo", jumsoo);

        if (name.equals("") || jumsoo.equals("")) {
            return "index2";
        } if (Integer.parseInt(jumsoo) >= 90) {
            return "kaja/kajaA";
        } else if (Integer.parseInt(jumsoo) >= 80) {
            return "kaja/kajaB";
        } else if (Integer.parseInt(jumsoo) >= 70) {
            return "kaja/kajaC";
        } else {
            return "kaja/kajaD";
        }
    }

}
