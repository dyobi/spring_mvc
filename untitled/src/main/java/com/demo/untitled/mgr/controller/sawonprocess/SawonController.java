package com.demo.untitled.mgr.controller.sawonprocess;

import com.demo.untitled.mgr.sawon.service.TelInfoService;
import com.demo.untitled.mgr.sawon.vo.TelInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

@Controller
public class SawonController {

    @Autowired
    private TelInfoService telInfoService;

    @RequestMapping("/getAllTelinfo.do")
    public String sawonGetAllTelinfo(TelInfoVo vo, Model model) throws ClassNotFoundException, SQLException {
        model.addAttribute("mAllTelinfo", telInfoService.getAllTelinfo(vo));
        return "sawonGetAllTelinfo";
    }

    @RequestMapping("/insertTelinfo.do")
    public String sawonInsertTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException  {
        telInfoService.insertTelinfo(vo);
        return "redirect:getAllTelinfo.do";
    }

    @RequestMapping("/getTelinfo.do")
    public String sawonGetTelinfo(TelInfoVo vo, Model model) throws SQLException, ClassNotFoundException {
        model.addAttribute("mTelinfo", telInfoService.getTelinfo(vo));
        return "sawonGetTelinfo";
    }

    @RequestMapping("/deleteTelinfo.do")
    public String sawonDeleteTelinfo(TelInfoVo vo) throws SQLException, ClassNotFoundException {
        telInfoService.deleteTelinfo(vo);
        return "redirect:getAllTelinfo.do";
    }

}
