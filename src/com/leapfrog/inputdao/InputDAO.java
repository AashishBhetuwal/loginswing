/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inputdao;

import com.leapfrog.input.Input;
import java.sql.SQLException;

/**
 *
 * @author Toshiba
 */
public interface InputDAO {
     boolean insert(Input input) throws ClassNotFoundException,SQLException;
}
