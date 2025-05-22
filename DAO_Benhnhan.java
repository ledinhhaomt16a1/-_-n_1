/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import model.Benhnhan;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author h1232
 */
public class DAO_Benhnhan {
    private Connection conn;
    public DAO_Benhnhan() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QL_quaythuoc;encrypt=true;trustServerCertificate=true",
                    "sa", "1232123aAa");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public boolean addBN(Benhnhan bn) {
        String sql = "INSERT INTO Benh_nhan(Ma_BN, Ten_BN, GT_BN, SDT_BN, DC_BN, Ma_Thuoc) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, bn.getMa_BN());
             ps.setString(2, bn.getTen_BN());
             ps.setString(3, bn.getGT_BN());
             ps.setLong(4, bn.getSDT_BN());
             ps.setString(5, bn.getDC_BN());
             ps.setString(6, bn.getMa_Thuoc());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Benhnhan> getListSBenhnhaṇ() {
        ArrayList<Benhnhan> list = new ArrayList<>();
        String sql = "SELECT * FROM Benh_nhan";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Benhnhan bn = new Benhnhan();
                bn.setMa_BN(rs.getString("Ma_BN"));
                bn.setTen_BN(rs.getString("Ten_BN"));
                bn.setGT_BN(rs.getString("GT_BN"));
                bn.setDC_BN(rs.getString("DC_BN"));
                bn.setSDT_BN(rs.getLong("SDT_BN"));
                bn.setMa_Thuoc(rs.getString("Ma_thuoc"));
                
                list.add(bn);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }   
    
    public static void main(String[] args) {
        new DAO_Benhnhan();
    }
}
