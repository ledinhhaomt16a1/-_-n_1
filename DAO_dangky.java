/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import model.Benhnhan;
import model.Tai_khoan;

/**
 *
 * @author h1232
 */
public class DAO_dangky {
    private Connection conn;
    public DAO_dangky() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean addTK(Tai_khoan tk) {
        String sql = "INSERT INTO Tai_khoan(Ten_TK, Mat_Khau, Quyen, Ten_NV, Ma_NV) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, tk.getTen_TK());
             ps.setString(2, tk.getMat_khau());
             ps.setString(3, tk.getQuyen());
             ps.setString(4, tk.getTen_NV());
             ps.setString(5, tk.getMa_NV());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Tai_khoan> getListSTai_khoan() {
        ArrayList<Tai_khoan> list = new ArrayList<>();
        String sql = "SELECT * FROM Tai_khoan";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Tai_khoan tk = new Tai_khoan();
                tk.setTen_TK(rs.getString("Ten_TK"));
                tk.setMat_khau(rs.getString("Mat_Khau"));
                tk.setQuyen(rs.getString("Quyen"));
                tk.setTen_NV(rs.getString("Ten_NV"));
                tk.setMa_NV(rs.getString("Ma_NV"));
                
                list.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
 
    public static void main(String[] args) {
        new DAO_dangky();
    }
    
}
