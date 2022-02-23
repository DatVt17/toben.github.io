/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Account.Account;
import Connect.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class accountDao {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    public void createStudent(String account, String password, String email, String gender, String birthday) {
        try {
            String query = "insert into Account values(?,?,?,?,?)";
            // Mở kết nối sql server
            conn = new DBContext().getConnection();
            //Đưa câu sql vào prepareStgament
            ps = conn.prepareStatement(query);
            ps.setString(1, account);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setString(4, gender);
            ps.setString(5, birthday);

            ps.executeUpdate();
            //Thực thi câu lệnh sql sẽ trả về result set    
        } catch (Exception ex) {
            Logger.getLogger(accountDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Account getAccountByUserPassword(String userString, String password) {
        try {
            String query = "select *from Account where account = ? and password = ?";
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, userString);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {                
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6));
            }
        } catch (Exception ex) {
            Logger.getLogger(accountDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
