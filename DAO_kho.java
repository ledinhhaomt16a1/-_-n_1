/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.ArrayList;
import model.Kho;
/**
 *
 * @author h1232
 */
public class DAO_kho {
    private Connection conn;
    public DAO_kho() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public boolean addNV(Kho k) {
        String sql = "INSERT INTO Kho(Ma_kho, Ma_Thuoc, Ten_Thuoc, Ton_kho) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, k.getMa_kho());
             ps.setString(2, k.getMa_Thuoc());
             ps.setString(3, k.getTen_Thuoc());
             ps.setString(4, k.getTon_kho());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Kho> getListSNhanvien() {
        ArrayList<Kho> list = new ArrayList<>();
        String sql = "SELECT * FROM Kho";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Kho k = new Kho();
                k.setMa_kho(rs.getString("Ma_kho"));
                k.setMa_Thuoc(rs.getString("Ma_Thuoc"));
                k.setTen_Thuoc(rs.getString("Ten_Thuoc"));
                k.setTon_kho(rs.getString("Ton_kho"));
                
                list.add(k);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static void main(String[] args) {
        new DAO_kho();
    }
}
