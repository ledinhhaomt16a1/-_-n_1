/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author h1232
 */
public class Tai_khoan {
    private String Ten_TK;
    private String Mat_khau;
    private String Quyen;
    private String Ten_NV;
    private String Ma_NV;

    public Tai_khoan() {
    }

    public Tai_khoan(String Ten_TK, String Mat_khau, String Quyen, String Ten_NV, String Ma_NV) {
        this.Ten_TK = Ten_TK;
        this.Mat_khau = Mat_khau;
        this.Quyen = Quyen;
        this.Ten_NV = Ten_NV;
        this.Ma_NV = Ma_NV;
    }

    public String getTen_TK() {
        return Ten_TK;
    }

    public String getMat_khau() {
        return Mat_khau;
    }

    public String getQuyen() {
        return Quyen;
    }

    public String getTen_NV() {
        return Ten_NV;
    }

    public String getMa_NV() {
        return Ma_NV;
    }

    public void setTen_TK(String Ten_TK) {
        this.Ten_TK = Ten_TK;
    }

    public void setMat_khau(String Mat_khau) {
        this.Mat_khau = Mat_khau;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public void setTen_NV(String Ten_NV) {
        this.Ten_NV = Ten_NV;
    }

    public void setMa_NV(String Ma_NV) {
        this.Ma_NV = Ma_NV;
    }

    
    
}
