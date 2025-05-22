/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import model.Thuoc;

/**
 *
 * @author h1232
 */
public class DAO_thuoc {
    private Connection conn;
    public DAO_thuoc() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean addThuoc(Thuoc t) {
        String sql = "INSERT INTO Thuoc(Ma_Thuoc, Ten_Thuoc , Ham_luong, Gia, HSD, Hang_SX, Ton_kho) VALUES(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, t.getMa_Thuoc());
             ps.setString(2, t.getTen_Thuoc());
             ps.setString(3, t.getHam_luong());
             ps.setFloat(4, t.getGia());
             ps.setDate(5, new Date(t.getHSD().getTime()));
             ps.setString(6, t.getHang_SX());
             ps.setString(7, t.getTon_kho());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Thuoc> getListSThuoc() {
        ArrayList<Thuoc> list = new ArrayList<>();
        String sql = "SELECT * FROM Thuoc";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Thuoc t = new Thuoc();
                t.setMa_Thuoc(rs.getString("Ma_Thuoc"));
                t.setTen_Thuoc(rs.getString("Ten_Thuoc"));
                t.setHam_luong(rs.getString("Ham_luong"));
                t.setGia(rs.getFloat("Gia"));
                t.setHSD(rs.getDate("HSD"));
                t.setHang_SX(rs.getString("Hang_SX"));
                t.setTon_kho(rs.getString("Ton_kho"));
                
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
     public static void main(String[] args) {
        new DAO_thuoc();
    }
}
