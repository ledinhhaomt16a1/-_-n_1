/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author h1232
 */
public class Nha_cc {
    private String Ma_NCC;
    private String Ten_NCC;
    private String DC_NCC;
    private String Ma_Thuoc;

    public Nha_cc() {
    }

    public Nha_cc(String Ma_NCC, String Ten_NCC, String DC_NCC, String Ma_Thuoc) {
        this.Ma_NCC = Ma_NCC;
        this.Ten_NCC = Ten_NCC;
        this.DC_NCC = DC_NCC;
        this.Ma_Thuoc = Ma_Thuoc;
    }

    public String getMa_NCC() {
        return Ma_NCC;
    }

    public String getTen_NCC() {
        return Ten_NCC;
    }

    public String getDC_NCC() {
        return DC_NCC;
    }

    public String getMa_Thuoc() {
        return Ma_Thuoc;
    }

    public void setMa_NCC(String Ma_NCC) {
        this.Ma_NCC = Ma_NCC;
    }

    public void setTen_NCC(String Ten_NCC) {
        this.Ten_NCC = Ten_NCC;
    }

    public void setDC_NCC(String DC_NCC) {
        this.DC_NCC = DC_NCC;
    }

    public void setMa_Thuoc(String Ma_Thuoc) {
        this.Ma_Thuoc = Ma_Thuoc;
    }
    
}
