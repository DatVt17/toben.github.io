/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Account {
    public int id;
    public String account;
    public String password;
    public String email;
    public int gender;
    public Date date;

    public Account(int id, String account, String password, String email, int gender, Date date) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.date = date;
    }

    public Account() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", account=" + account + ", password=" + password + ", email=" + email + ", gender=" + gender + ", date=" + date + '}';
    }
    
}
