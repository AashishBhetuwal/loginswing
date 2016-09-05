/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inputdaoimpl;

import com.leapfrog.input.Input;
import com.leapfrog.inputdao.InputDAO;
import com.sun.jndi.ldap.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Toshiba
 */
public class inputDAOImpl implements InputDAO{

    @Override
    public boolean insert(Input input) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost/loginswing","root", null);
        System.out.println("connection Successful");
        String sql="Insert into login(firstname,lastname,email,password) values(?,?,?,?)";
        PreparedStatement st=con.prepareStatement(sql);
        st.setString(1,input.getFirstname());
        st.setString(2, input.getLastname());
        st.setString(3,input.getEmail());
        st.setString(4, input.getPassword());
        
        st.executeUpdate();
        
        con.close();
        return true;
    }
    
}
