/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author fauzimakarim
 */
public class Penyimpanan_Data {
    private Integer Id_Penyimpanan;
    private Booking booking;
    private Struk struk;
    private String Nama_Team;
    private Date Tanggal;
    private String Nama_Pemesan;
    private Double Total;
    private String Lapangan;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
    
    

    public Integer getId_Penyimpanan() {
        return Id_Penyimpanan;
    }

    public void setId_Penyimpanan(Integer Id_Penyimpanan) {
        this.Id_Penyimpanan = Id_Penyimpanan;
    }

    public Struk getStruk() {
        return struk;
    }

    public void setStruk(Struk struk) {
        this.struk = struk;
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

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public String getLapangan() {
        return Lapangan;
    }

    public void setLapangan(String Lapangan) {
        this.Lapangan = Lapangan;
    }
    
}
