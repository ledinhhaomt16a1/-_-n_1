/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import model.Nhanvien;


/**
 *
 * @author h1232
 */
public class DAO_Nhanvien {
    private Connection conn;
    public DAO_Nhanvien() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean addNV(Nhanvien nv) {
        String sql = "INSERT INTO Nhan_vien(Ma_NV, Ten_NV, GT_NV, SDT_NV) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, nv.getMa_NV());
             ps.setString(2, nv.getTen_NV());
             ps.setString(3, nv.getGT_NV());
             ps.setLong(4, nv.getSDT_NV());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Nhanvien> getListSNhanvien() {
        ArrayList<Nhanvien> list = new ArrayList<>();
        String sql = "SELECT Ma_NV, Ten_NV, GT_NV, SDT_NV FROM Nhan_vien";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Nhanvien nv = new Nhanvien();
                nv.setMa_NV(rs.getString("Ma_NV"));
                nv.setTen_NV(rs.getString("Ten_NV"));
                nv.setGT_NV(rs.getString("GT_NV"));
                nv.setSDT_NV(rs.getLong("SDT_NV"));
                
                list.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        new DAO_Nhanvien();
    }
}