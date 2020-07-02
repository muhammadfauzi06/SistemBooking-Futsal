/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fauzimakarim
 */
public class Admin {
    private Integer Id_Admin;
    private String Admin;
    private String Username;

    public Integer getId_Admin() {
        return Id_Admin;
    }

    public void setId_Admin(Integer Id_Admin) {
        this.Id_Admin = Id_Admin;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public String Username() {
        return Username;
    }

    public void Username(String Username) {
        this.Username = Username;
    }
}
