/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author h1232
 */
public class Khoa_dt {
    private String Ma_khoa;
    private String Ten_khoa;
    private String Ma_BN;

    public Khoa_dt() {
    }

    public Khoa_dt(String Ma_khoa, String Ten_khoa, String Ma_BN) {
        this.Ma_khoa = Ma_khoa;
        this.Ten_khoa = Ten_khoa;
        this.Ma_BN = Ma_BN;
    }

    public String getMa_khoa() {
        return Ma_khoa;
    }

    public String getTen_khoa() {
        return Ten_khoa;
    }

    public String getMa_BN() {
        return Ma_BN;
    }

    public void setMa_khoa(String Ma_khoa) {
        this.Ma_khoa = Ma_khoa;
    }

    public void setTen_khoa(String Ten_khoa) {
        this.Ten_khoa = Ten_khoa;
    }

    public void setMa_BN(String Ma_BN) {
        this.Ma_BN = Ma_BN;
    }
    
}
