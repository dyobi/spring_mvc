package com.demo.untitled.mgr.sawon.service;

import com.demo.untitled.mgr.sawon.vo.TelInfoVo;

import java.sql.SQLException;
import java.util.ArrayList;

public interface TelInfoService {

    ArrayList<TelInfoVo> getAllTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException;

    TelInfoVo getTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException;

//    void updateTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException;

    void insertTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException;

    void deleteTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException;

}
