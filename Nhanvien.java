/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author h1232
 */
public class Nhanvien {
    private String Ma_NV;
    private String Ten_NV;
    private String GT_NV;
    private long SDT_NV;
    private String Ma_NCC;
    private String Ma_BN;

    public Nhanvien() {
    }

    public Nhanvien(String Ma_NV, String Ten_NV, String GT_NV, long SDT_NV, String Ma_NCC, String Ma_BN) {
        this.Ma_NV = Ma_NV;
        this.Ten_NV = Ten_NV;
        this.GT_NV = GT_NV;
        this.SDT_NV = SDT_NV;
        this.Ma_NCC = Ma_NCC;
        this.Ma_BN = Ma_BN;
    }

    public String getMa_NV() {
        return Ma_NV;
    }

    public String getTen_NV() {
        return Ten_NV;
    }

    public String getGT_NV() {
        return GT_NV;
    }

    public long getSDT_NV() {
        return SDT_NV;
    }

    public String getMa_NCC() {
        return Ma_NCC;
    }

    public String getMa_BN() {
        return Ma_BN;
    }

    public void setMa_NV(String Ma_NV) {
        this.Ma_NV = Ma_NV;
    }

    public void setTen_NV(String Ten_NV) {
        this.Ten_NV = Ten_NV;
    }

    public void setGT_NV(String GT_NV) {
        this.GT_NV = GT_NV;
    }

    public void setSDT_NV(long SDT_NV) {
        this.SDT_NV = SDT_NV;
    }

    public void setMa_NCC(String Ma_NCC) {
        this.Ma_NCC = Ma_NCC;
    }

    public void setMa_BN(String Ma_BN) {
        this.Ma_BN = Ma_BN;
    }
    
}
