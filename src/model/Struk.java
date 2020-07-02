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
public class Struk {
    private Integer Id_Struk;
    private Penyimpanan_Data penyimpanan;
    private Booking booking;
    private Double Total;
    private String Jam;
    private String Nama_Pemesan;
    private String Lapangan;
    private String Waktu;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    
    
    public Penyimpanan_Data getPenyimpanan() {
        return penyimpanan;
    }

    public void setPenyimpanan(Penyimpanan_Data penyimpanan) {
        this.penyimpanan = penyimpanan;
    }
    
    

    public Integer getId_Struk() {
        return Id_Struk;
    }

    public void setId_Struk(Integer Id_Struk) {
        this.Id_Struk = Id_Struk;
    }

 
    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double Total) {
        this.Total = Total;
    }

    public String getJam() {
        return Jam;
    }

    public void setJam(String Jam) {
        this.Jam = Jam;
    }

    public String getNama_Pemesan() {
        return Nama_Pemesan;
    }

    public void setNama_Pemesan(String Nama_Pemesan) {
        this.Nama_Pemesan = Nama_Pemesan;
    }

    public String getLapangan() {
        return Lapangan;
    }

    public void setLapangan(String Lapangan) {
        this.Lapangan = Lapangan;
    }

    public String getWaktu() {
        return Waktu;
    }

    public void setWaktu(String Waktu) {
        this.Waktu = Waktu;
    }
    
}
