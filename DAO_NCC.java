/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import model.Nha_cc;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author h1232
 */
public class DAO_NCC {
    private Connection conn;
    public DAO_NCC() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public boolean addNCC(Nha_cc ncc) {
        String sql = "INSERT INTO Nha_cung_cap(Ma_NCC, Ten_NCC, DC_NCC) VALUES(?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, ncc.getMa_NCC());
             ps.setString(2, ncc.getTen_NCC());
             ps.setString(3, ncc.getDC_NCC());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Nha_cc> getListSNCC() {
        ArrayList<Nha_cc> list = new ArrayList<>();
        String sql = "SELECT * FROM Nha_cung_cap";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Nha_cc ncc = new Nha_cc();
                ncc.setMa_NCC(rs.getString("Ma_NCC"));
                ncc.setTen_NCC(rs.getString("Ten_NCC"));
                ncc.setDC_NCC(rs.getString("DC_NCC"));
                
                list.add(ncc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }   
    
    public static void main(String[] args) {
        new DAO_NCC();
    }
}
