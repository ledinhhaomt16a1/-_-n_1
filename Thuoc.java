/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author h1232
 */
public class Thuoc {
    private String Ma_Thuoc;
    private String Ten_Thuoc;
    private String Ham_luong;
    private float Gia;
    private Date HSD;
    private String Hang_SX;

    public void setMa_Thuoc(String Ma_Thuoc) {
        this.Ma_Thuoc = Ma_Thuoc;
    }

    public void setTen_Thuoc(String Ten_Thuoc) {
        this.Ten_Thuoc = Ten_Thuoc;
    }

    public void setHam_luong(String Ham_luong) {
        this.Ham_luong = Ham_luong;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public void setHang_SX(String Hang_SX) {
        this.Hang_SX = Hang_SX;
    }

    public String getMa_Thuoc() {
        return Ma_Thuoc;
    }

    public String getTen_Thuoc() {
        return Ten_Thuoc;
    }

    public String getHam_luong() {
        return Ham_luong;
    }

    public float getGia() {
        return Gia;
    }

    public Date getHSD() {
        return HSD;
    }

    public String getHang_SX() {
        return Hang_SX;
    }

    public Thuoc(String Ma_Thuoc, String Ten_Thuoc, String Ham_luong, float Gia, Date HSD, String Hang_SX) {
        this.Ma_Thuoc = Ma_Thuoc;
        this.Ten_Thuoc = Ten_Thuoc;
        this.Ham_luong = Ham_luong;
        this.Gia = Gia;
        this.HSD = HSD;
        this.Hang_SX = Hang_SX;
    }

    public Thuoc() {
    }
}
