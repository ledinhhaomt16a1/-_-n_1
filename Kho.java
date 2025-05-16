/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author h1232
 */
public class Kho {
    private String Ma_kho;
    private String Ten_kho;
    private String Ma_thuoc;
    private String Ton_kho;

    public Kho() {
    }

    public Kho(String Ma_kho, String Ten_kho, String Ma_thuoc, String Ton_kho) {
        this.Ma_kho = Ma_kho;
        this.Ten_kho = Ten_kho;
        this.Ma_thuoc = Ma_thuoc;
        this.Ton_kho = Ton_kho;
    }

    public String getMa_kho() {
        return Ma_kho;
    }

    public String getTen_kho() {
        return Ten_kho;
    }

    public String getMa_thuoc() {
        return Ma_thuoc;
    }

    public String getTon_kho() {
        return Ton_kho;
    }

    public void setMa_kho(String Ma_kho) {
        this.Ma_kho = Ma_kho;
    }

    public void setTen_kho(String Ten_kho) {
        this.Ten_kho = Ten_kho;
    }

    public void setMa_thuoc(String Ma_thuoc) {
        this.Ma_thuoc = Ma_thuoc;
    }

    public void setTon_kho(String Ton_kho) {
        this.Ton_kho = Ton_kho;
    }
    
}
