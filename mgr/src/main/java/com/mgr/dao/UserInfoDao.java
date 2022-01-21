package com.mgr.dao;

import com.mgr.dto.User;
import com.mgr.util.DBConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Repository
public class UserInfoDao {

    private Connection con;
    private PreparedStatement pst = null;
    private ResultSet res = null;
    private String sql = null;

    public UserInfoDao() throws SQLException, ClassNotFoundException {
        con = new DBConnection().getCon();
    }

    public ArrayList<User> getAll() throws SQLException {
        sql = "SELECT * FROM teltable55 ORDER BY id";
        ArrayList<User> users = new ArrayList<>();

        pst = con.prepareStatement(sql);
        res = pst.executeQuery();

        while (res.next()) {
            User user = new User(
                    res.getInt("id"),
                    res.getString("name"),
                    res.getString("tel")
            );
            users.add(user);
        }
        return users;
    }

    public User getOne(User user) throws SQLException {
        sql = "SELECT * FROM teltable55 WHERE name = ?";
        User res_user = null;

        pst = con.prepareStatement(sql);
        pst.setString(1, user.getName());
        res = pst.executeQuery();

        if (res.next()) {
            res_user = new User(
                    res.getInt("id"),
                    res.getString("name"),
                    res.getString("tel")
            );
        }
        return res_user;
    }

    public boolean updateUser(User user) throws SQLException {
        sql = "UPDATE teltable55 SET id = ?, tel = ? WHERE name = ?";

        pst = con.prepareStatement(sql);
        pst.setInt(1, user.getId());
        pst.setString(2, user.getTel());
        pst.setString(3, user.getName());

        return pst.executeUpdate() == 1;
    }

    public boolean insertUser(User user) throws SQLException {
        sql = "INSERT INTO teltable55 VALUES (?, ?, ?)";

        pst = con.prepareStatement(sql);
        pst.setInt(1, user.getId());
        pst.setString(2, user.getName());
        pst.setString(3, user.getTel());

        return pst.executeUpdate() == 1;
    }

    public void deleteUser(String name) throws SQLException {
        sql = "DELETE FROM teltable55 WHERE name = ?";

        pst = con.prepareStatement(sql);
        pst.setString(1, name);

        pst.executeUpdate();
    }

}
