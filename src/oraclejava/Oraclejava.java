/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclejava;

import database.Koneksi;
import java.sql.SQLException;
import java.text.ParseException;
import view.Login;
import view.TransaksiView;


public class Oraclejava {
    public static void main(String[] args) throws SQLException,ParseException{
         new Login().setVisible(true);
        
    }
}
