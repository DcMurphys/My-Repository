/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author dwicd
 */
public class model_datapasien {
    
    // Koneksi ke Database
    private String sql;
    
    ResultSet rs;
    PreparedStatement st;
    Connection conn = controller.database.getDBConn();

    // Deklarasi Variabel
    public int id;
    public int nik;
    public String nama;
    public String alamat;
    public String date_input;
    public int no_bpjs;
    public String jenis_kelamin;
    
    public void simpan() throws SQLException {
        st = conn.prepareStatement("INSERT INTO data_pasien (id,nik,nama,alamat,tanggalLahir,no_bpjs,jenis_kelamin) VALUES (?,?,?,?,?,?,?)");
        st.setInt(1,id);
        st.setInt(2, nik);
        st.setString(3, nama);
        st.setString(4, alamat);
        st.setObject(5, date_input);
        st.setInt(6, no_bpjs);
        st.setString(7, jenis_kelamin);
        st.execute();
        st.close();
    }
    
    public void ubah() throws SQLException {
        st = conn.prepareStatement("UPDATE data_pasien SET nama=?, alamat=?, tanggalLahir=?, no_bpjs=?,jenis_kelamin=? WHERE nik=?");
        st.setString(1, nama);
        st.setString(2, alamat);
        st.setObject(3, date_input);
        st.setInt(4, no_bpjs);
        st.setString(5, jenis_kelamin);
        st.setInt(6, nik);
        st.execute();
        st.close();
    }
    
    public void hapus() throws SQLException {
        try {
            st = st = conn.prepareStatement("DELETE FROM data_pasien WHERE nik=?");
            st.setInt(1, nik);
            st.execute();
            st.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
