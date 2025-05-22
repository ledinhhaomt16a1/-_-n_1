/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import model.Khoa_dt;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author h1232
 */
public class DAO_khoadt {
    private Connection conn;
    public DAO_khoadt() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean addKDT(Khoa_dt kdt) {
        String sql = "INSERT INTO Khoa_dt(Ma_khoa, Ten_khoa, Ma_BN, Ten_BN) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, kdt.getMa_khoa());
             ps.setString(2, kdt.getTen_khoa());
             ps.setString(3, kdt.getMa_BN());
             ps.setString(4, kdt.getTen_BN());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Khoa_dt> getListSKDT() {
        ArrayList<Khoa_dt> list = new ArrayList<>();
        String sql = "SELECT * FROM Khoa_dt";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Khoa_dt kdt = new Khoa_dt();
                kdt.setMa_khoa(rs.getString("Ma_khoa"));
                kdt.setTen_khoa(rs.getString("Ten_khoa"));
                kdt.setMa_BN(rs.getString("Ma_BN"));
                kdt.setTen_BN(rs.getString("Ten_BN"));
                
                list.add(kdt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }   
    
    public static void main(String[] args) {
        new DAO_khoadt();
    }
}
