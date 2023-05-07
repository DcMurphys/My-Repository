package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dwicd
 */
public class mahasiswa_model {
    
    private String sql;
    
    ResultSet rs;
    PreparedStatement st;
    Connection conn = controller.database.getDBConn();
    
    int id;
    String nim;
    String nama;
    int rerata;
    String grade;
    String keterangan;
    
    public void simpanNilai() throws SQLException {
        st = conn.prepareStatement("INSERT INTO nilai_mahasiswa (id, nim, nama, rerata, grade, keterangan) VALUES (?, ?, ?, ?, ?, ?)");
        st.setInt(1, id);
        st.setString(2, nim);
        st.setString(3, nama);
        st.setInt(4, rerata);
        st.setString(5, grade);
        st.setString(6, keterangan);
        st.execute();
        st.close();
    }
    
    public void hapusData() throws SQLException {
        st = conn.prepareStatement("DELETE FROM nilai_mahasiswa WHERE nim = ?");
        st.setString(1, nim);
        st.execute();
        st.close();
    }
    
    public void getNilaiByNIM() throws SQLException {
        st = conn.prepareStatement("SELECT nama, rerata, grade, keterangan FROM nilai_mahasiswa WHERE nim = ?");
        st.setString(1, nama);
        st.setInt(2, rerata);
        st.setString(3, grade);
        st.setString(4, keterangan);
        st.setString(5, nim);
        st.execute();
        st.close();
    }
    
    public void getNilaiByNama() throws SQLException {
        st = conn.prepareStatement("SELECT nim, rerata, grade, keterangan FROM nilai_mahasiswa WHERE nama %?%");
        st.setString(1, nim);
        st.setInt(2, rerata);
        st.setString(3, grade);
        st.setString(4, keterangan);
        st.setString(5, nama);
        st.execute();
        st.close();    
    }
    
    
}
