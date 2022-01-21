package com.mgr.dao;

import com.mgr.dto.Auth;
import com.mgr.util.DBConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class AuthDao {

    private Connection con;
    private PreparedStatement pst = null;
    private ResultSet res = null;
    private String sql = null;

    public AuthDao() throws SQLException, ClassNotFoundException {
        con = new DBConnection().getCon();
    }

    public boolean authLogin(Auth auth) throws SQLException {
        sql = "SELECT * FROM teltable55_user WHERE id = ? AND pwd = ?";

        pst = con.prepareStatement(sql);
        pst.setString(1, auth.getId());
        pst.setString(2, auth.getPwd());
        res = pst.executeQuery();

        return res.next();
    }

    public boolean authJoin(Auth auth) throws SQLException {
        sql = "INSERT INTO teltable55_user VALUES (?, ?)";

        pst = con.prepareStatement(sql);
        pst.setString(1, auth.getId());
        pst.setString(2, auth.getPwd());

        return pst.executeUpdate() == 1;
    }

}
