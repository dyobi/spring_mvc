package com.demo.untitled.mgr.sawon.dao;

import com.demo.untitled.mgr.dbconn.TelInfoDBConn;
import com.demo.untitled.mgr.sawon.vo.TelInfoVo;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class TelInfoDao {

    private Connection con;
    PreparedStatement pst = null;
    ResultSet res = null;

    public TelInfoDao() throws ClassNotFoundException, SQLException {
        con = new TelInfoDBConn().getConnection();
    }

    public ArrayList<TelInfoVo> getAllTelinfo(TelInfoVo vo) throws SQLException {
        ArrayList<TelInfoVo> arr = new ArrayList<TelInfoVo>();
        String sql = "SELECT * FROM teltable55 ORDER BY id";

        pst = con.prepareStatement(sql);
        res = pst.executeQuery();
        while (res.next()) {
            TelInfoVo telinfo = new TelInfoVo();
            telinfo.setId(res.getInt("id"));
            telinfo.setName(res.getString("name"));
            telinfo.setTel(res.getString("tel"));
            arr.add(telinfo);
        }
        return arr;
    }

    public void insertTelinfo(TelInfoVo vo) throws SQLException {
        String sql = "INSERT INTO teltable55 VALUES (?, ?, ?)";

        pst = con.prepareStatement(sql);
        pst.setInt(1, vo.getId());
        pst.setString(2, vo.getName());
        pst.setString(3, vo.getTel());

        pst.executeQuery();
    }

    public TelInfoVo getTelinfo(TelInfoVo vo) throws SQLException {
        TelInfoVo telInfoVo = null;
        String sql = "SELECT * FROM teltable55 WHERE name = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, vo.getName());
        res = pst.executeQuery();

        if (res.next()) {
            telInfoVo = new TelInfoVo();
            telInfoVo.setId(res.getInt("id"));
            telInfoVo.setName(res.getString("name"));
            telInfoVo.setTel(res.getString("tel"));
        }
        return telInfoVo;
    }

    public void deleteTelinfo(TelInfoVo vo) throws SQLException {
        String sql = "DELETE teltable55 WHERE name = ?";
        pst = con.prepareStatement(sql);
        pst.setString(1, vo.getName());
        pst.executeQuery();
    }

}
