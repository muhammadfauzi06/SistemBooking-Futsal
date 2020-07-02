/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;



/**
 *
 * @author user
 */
public class Register {
    private Integer Id_Register;
    private Admin admin;
    private String Nama_Team;
    private Date Tanggal;
    private String Nama_Pemesan;
    private Integer Pukul;
    private Integer Telepon;

    public Integer getId_Register() {
        return Id_Register;
    }

    public void setId_Register(Integer Id_Register) {
        this.Id_Register = Id_Register;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

  

    public String getNama_Team() {
        return Nama_Team;
    }

    public void setNama_Team(String Nama_Team) {
        this.Nama_Team = Nama_Team;
    }

    public Date getTanggal() {
        return Tanggal;
    }

    public void setTanggal(Date Tanggal) {
        this.Tanggal = Tanggal;
    }



    public String getNama_Pemesan() {
        return Nama_Pemesan;
    }

    public void setNama_Pemesan(String Nama_Pemesan) {
        this.Nama_Pemesan = Nama_Pemesan;
    }

    public Integer getPukul() {
        return Pukul;
    }

    public void setPukul(Integer Pukul) {
        this.Pukul = Pukul;
    }

    public Integer getTelepon() {
        return Telepon;
    }

    public void setTelepon(Integer Telepon) {
        this.Telepon = Telepon;
    }
    
}
