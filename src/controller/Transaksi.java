/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.*;
import model.*;
import database.Koneksi;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author fauzimakarim
 */
public class Transaksi {
    

    Koneksi koneksi;
    ArrayList<Booking> arrBooking;
    ArrayList<Register>arrRegister;
    ArrayList<Struk>arrStruk;
    ArrayList<Penyimpanan_Data>arrpenyimpanan;
    

    public Transaksi() throws SQLException {
        this.koneksi = new Koneksi();
        this.arrRegister = new ArrayList<>();
        this.arrBooking = new ArrayList<>();
        this.arrpenyimpanan = new ArrayList<>();
        this.arrStruk = new ArrayList<>();
    }
    public ArrayList<Register> getLogin() throws SQLException {
        arrRegister.clear();
        ResultSet rs = this.koneksi.getData("SELECT * FROM REGISTER_06948 ");
            while(rs.next()) {
                
//                Register.setRegister(rs.getString("Register"));
                
                Register register = new Register();
                register.setId_Register(rs.getInt("ID_Register"));
                register.setNama_Team(rs.getNString("NAMA_TEAM"));
                register.setTanggal(rs.getDate("Tanggal"));
                register.setNama_Pemesan(rs.getNString("Nama_Pemesan"));
                register.setPukul(rs.getInt("Pukul"));
                register.setTelepon(rs.getInt("Telepon"));
                arrRegister.add(register);
            }
        return arrRegister;
    }
    public ArrayList<Booking> getBooking() throws SQLException {
        arrBooking.clear();
        ResultSet rs = this.koneksi.getData("SELECT * FROM BOOKING_06948 ");
            while(rs.next()) {
                
                Booking booking = new Booking();
                booking.setId_Booking(rs.getInt("ID_Booking"));
                booking.setNama_Pemesan(rs.getString("NAMA_BARANG"));
                booking.setNama_Team(rs.getString("NAMA _TEAM"));
                booking.setTanggal(rs.getDate("Tanggal"));
                booking.setPukul(rs.getInt("PUKUL"));
                booking.setTelepon(rs.getInt("TELEPON"));
                
                arrBooking.add(booking);
            }
        return arrBooking;
    }
    public ArrayList<Penyimpanan_Data> getPenyimpanan() throws SQLException {
        this.arrpenyimpanan.clear();
        ResultSet rs = this.koneksi.getData("SELECT * FROM BOOKING_06948 JOIN PENYIMPANAN_DATA_06948 ON BOOKING_06948.ID_BOOKING = PENYIMPANAN_DATA_06948.ID_PENYIMPANAN JOIN STRUK_06948 ON PENYIMPANAN_DATA_06948.ID_PENYIMPANAN = STRUK_06948.ID_STRUK");
            while(rs.next()) {

                
                
                
                Penyimpanan_Data penyimpanan_data = new Penyimpanan_Data();
                penyimpanan_data.setId_Penyimpanan(rs.getInt("ID_PENYIMPANAN"));
                penyimpanan_data.setNama_Team(rs.getNString("NAMA_TEAM"));
                penyimpanan_data.setTanggal(rs.getDate("TANGGAL"));
                penyimpanan_data.setNama_Pemesan(rs.getNString("NAMA_PEMESAN"));
                penyimpanan_data.setTotal(rs.getDouble("TOTAL"));
                penyimpanan_data.setLapangan(rs.getNString("LAPANGAN"));
 
                
                arrpenyimpanan.add(penyimpanan_data);
            }
            return arrpenyimpanan;
    }
    public ArrayList<Struk> getStruk() throws SQLException{
        arrStruk.clear();
        ResultSet rs = this.koneksi.getData("SELECT * FROM STRUK_06948 "
                );
            while(rs.next()){
                
                Struk struk = new Struk();
                struk.setId_Struk(rs.getInt("ID_STRUK"));
                struk.setTotal(rs.getDouble("TOTAL"));
                struk.setJam(rs.getString("JAM"));
                struk.setNama_Pemesan(rs.getNString("NAMA_PEMESAN"));
                struk.setLapangan(rs.getNString("LAPANGAN"));
                struk.setWaktu(rs.getNString("WAKTU"));
                
                arrStruk.add(struk);
            }
            return arrStruk;
    }


}
//    }
//                
//        ResultSet rsDetail_Transaksi = koneksi.GetData("SELECT * FROM DETAIL_PEMESANAN JOIN BARANG ON DETAIL_PEMESANAN.ID_BARANG = BARANG.ID_BARANG JOIN JENIS_BARANG ON BARANG.ID_JENIS_BARANG = JENIS_BARANG.ID_JENIS_BARANG WHERE DETAIL_PEMESANAN.ID_TRANSAKSI = " + rs.getString("ID_TRANSAKSI"));
//            ArrayList<Detail_Transaksi> dp = new ArrayList<>();
//            while(rsDetail_Transaksi.next()) {
//                Jenis_Barang jenis = new Jenis_Barang();
//                jenis.setId_Jenis_Barang(rsDetail_Transaksi.getInt("ID_JENIS_BARANG"));
//                jenis.setNama_Jenis_Barang(rsDetail_Transaksi.getString("NAMA_JENIS_BARANG"));
//                
//                Barang B = new Barang();
//                B.setId_Barang(rsDetail_Transaksi.getInt("ID_BARANG"));
//                B.setJenis_barang(jenis);
//                B.setNama_Barang(rsDetail_Transaksi.getString("NAMA_BARANG"));
//                B.setHarga(rsDetail_Transaksi.getInt("HARGA"));
//                B.setStock(rsDetail_Transaksi.getInt("STOCK"));
//                
//                Detail_Transaksi detail_transaksi = new Detail_Transaksi();
//                detail_transaksi.setBarang(B);
//                detail_transaksi.setJumlah(rsDetail_Transaksi.getInt("JUMLAH"));
//                
//                dp.add(detail_transaksi);
//            }
//            transaksi.setArrDetail_Transaksi(dp);
//            arrTransaksi.add(transaksi);
//            }    
//        return arrTransaksi;
//    }
//    public void insertTransaksi(Transaksi transaksi) {
//        try {
//            koneksi.ManipulasiData("INSERT INTO TRANSAKSI VALUES (ID_TRANSAKSI.NEXTVAL, " + transaksi.getJumlah_Pembelian() + "," + transaksi.getTotal_Harga() + ","+ transaksi.getBayar() + "," + transaksi.getKembali() + ")");
//            ResultSet rs = koneksi.GetData("SELECT ID_TRANSAKSI.CURRVAL FROM DUAL");
//            System.out.println(rs);
//            rs.next();
//            int Id_Transaksi = rs.getInt("CURRVAL");
//            for(Detail_Transaksi p : transaksi.getArrDetail_Transaksi()) {
//                koneksi.ManipulasiData("INSERT INTO DETAIL_PEMESANAN VALUES (" + Id_Transaksi
//                                       + "," + p.getBarang().getId_Barang() + "," + p.getJumlah() + ")");
//                koneksi.ManipulasiData("UPDATE BARANG SET STOCK = STOCK - " + p.getJumlah()
//                                       + "WHERE ID_BARANG = " + p.getBarang().getId_Barang());
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//    }
//    public void insertJenisBarang(Jenis_Barang jenis_Barang) {
//        try {
//            koneksi.ManipulasiData("INSERT INTO JENIS_BARANG VALUES (ID_JENIS_BARANG.NEXTVAL, '" + jenis_Barang.getNama_Jenis_Barang() + "')");
//            ResultSet rs = koneksi.GetData("SELECT ID_JENIS_BARANG.CURRVAL FROM DUAL");
//            System.out.println(rs);
//            rs.next();
//        } catch (SQLException ex) {
//            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
//        }
//                
//    }
//    public void deleteJenisBarang(Jenis_Barang jenis_Barang) {
//        koneksi.ManipulasiData("DELETE FROM JENIS_BARANG WHERE ID_JENIS_BARANG = " + jenis_Barang.getId_Jenis_Barang());
//    }
//    public void insertBarang(Barang barang) {
//        try {
//            koneksi.ManipulasiData("INSERT INTO BARANG VALUES (ID_BARANG.NEXTVAL, " +barang.getJenis_barang().getId_Jenis_Barang()+ ",'" + barang.getNama_Barang()+ "'," + barang.getHarga() + "," + barang.getStock() + ")");
//            ResultSet rs = koneksi.GetData("SELECT ID_BARANG.CURRVAL FROM DUAL");
//            System.out.println(rs);
//            rs.next();
//        } catch (SQLException ex) {
//            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//    public void updateBarang(Barang barang, int Stock, int Harga) {
//        koneksi.ManipulasiData("UPDATE BARANG SET HARGA = " + Harga + ",STOCK = " + Stock + "WHERE ID_BARANG = " + barang.getId_Barang());
//    }
//    public void deleteBarang(Barang barang) {
//        koneksi.ManipulasiData("DELETE FROM BARANG WHERE ID_BARANG = " + barang.getId_Barang());
//    }
//}
