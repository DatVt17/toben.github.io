/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Date;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validation {

    public boolean checkUserName(String UserName) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{8,16}$");
        if (p.matcher(UserName).find()) {
            return true;
        }
        return false;
    }

    public boolean checkPassword(String password) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]{8,16}$");
        if (p.matcher(password).find()) {
            return true;
        }
        return false;
    }

    public boolean checkEmail(String email) {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        if (p.matcher(email).find()) {
            return true;
        }
        return false;
    }
    
    public boolean checkDuplicatPassword(String password,String rePassword){
        if(password.equals(rePassword)){
            return true;
        }
        return false;
    }

    public String checkGender(String gender) {
        String gender1 = null;
        if (gender.equals("nam")) {
            gender1 = "0";
        }
        if (gender.equals("nu")) {
            gender1 = "1";
        }
        return gender1;
    }

    public String checkBirthday(String birthday) {
        String birthday1 = null;
        String[] dob = birthday.split("-");
        return birthday1;
    }
    
    public static void main(String[] args) {
        String birthday = "01-10-2001";
        Validation validation = new Validation();
    
         String[] dob = birthday.split("-");
         for (String string : dob) {
             System.out.println(dob);
        }
    }
}
