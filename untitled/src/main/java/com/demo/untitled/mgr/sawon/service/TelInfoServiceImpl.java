package com.demo.untitled.mgr.sawon.service;

import com.demo.untitled.mgr.sawon.dao.TelInfoDao;
import com.demo.untitled.mgr.sawon.vo.TelInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.ArrayList;

@Service
public class TelInfoServiceImpl implements TelInfoService{

    @Autowired
    private TelInfoDao telInfoDao;

    public ArrayList<TelInfoVo> getAllTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException {
        return telInfoDao.getAllTelinfo(vo);
    }

    public void insertTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException {
        telInfoDao.insertTelinfo(vo);
    }

    public TelInfoVo getTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException {
        return telInfoDao.getTelinfo(vo);
    }

//    public void updateTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException {
//        telInfoDao.updateTelinfo(vo);
//    }
//
    public void deleteTelinfo(TelInfoVo vo) throws ClassNotFoundException, SQLException {
        telInfoDao.deleteTelinfo(vo);
    }
}
