/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import uas.model.ModelPeminjaman;
import uas.util.Koneksi;

/**
 *
 * @author MalingerS Media
 */
public class ControllerPeminjaman {
    Koneksi koneksi = new Koneksi();
    
    public void simpanData(ModelPeminjaman mp){//memanggil kelas ModelPeminjaman dan membuat objek mp
         koneksi.koneksiDatabase();
        String query = "insert into tbl_peminjaman(namaTeman,barangPinjam) values ('"+mp.getNama()+"','"+mp.getBarang()+"')";
        try {
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil disimpan");
            System.err.println(""+e);
        }
    }
    
    public void hapusData(ModelPeminjaman mp){
        try {
            koneksi.koneksiDatabase();
            String query = "delete from tbl_peminjaman where id=('"+mp.getId()+"')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus..");
            //koneksi.connect.close();
        } catch (SQLException e) {
            System.err.println("Error : "+e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terhapus");
        }
    }
    
    public void ubahData(ModelPeminjaman mp){
        koneksi.koneksiDatabase();
         try {
            int id = mp.getId();
            String nama = mp.getNama();
            String barang = mp.getBarang();

            String query = "update tbl_peminjaman "
                    + "set namaTeman=('" + nama + "'),"
                    + "barangPinjam=('"+ barang +"')"
                    + "where id=('" + id + "')";
            koneksi.state.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate..");
        } catch (SQLException e) {
            System.err.println("Error : " + e);
            JOptionPane.showMessageDialog(null, "Data TIDAK terubah");
        }
    }
}
