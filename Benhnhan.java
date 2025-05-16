/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author h1232
 */
public class Benhnhan {
    private String Ma_BN;
    private String Ten_BN;
    private String GT_BN;
    private long SDT_BN;
    private String DC_BN;
    private String Ma_Thuoc;

    public Benhnhan() {
    }

    public Benhnhan(String Ma_BN, String Ten_BN, String GT_BN, long SDT_BN, String DC_BN, String Ma_Thuoc) {
        this.Ma_BN = Ma_BN;
        this.Ten_BN = Ten_BN;
        this.GT_BN = GT_BN;
        this.SDT_BN = SDT_BN;
        this.DC_BN = DC_BN;
        this.Ma_Thuoc = Ma_Thuoc;
    }

    public String getMa_BN() {
        return Ma_BN;
    }

    public String getTen_BN() {
        return Ten_BN;
    }

    public String getGT_BN() {
        return GT_BN;
    }

    public long getSDT_BN() {
        return SDT_BN;
    }

    public String getDC_BN() {
        return DC_BN;
    }

    public String getMa_Thuoc() {
        return Ma_Thuoc;
    }

    public void setMa_BN(String Ma_BN) {
        this.Ma_BN = Ma_BN;
    }

    public void setTen_BN(String Ten_BN) {
        this.Ten_BN = Ten_BN;
    }

    public void setGT_BN(String GT_BN) {
        this.GT_BN = GT_BN;
    }

    public void setSDT_BN(long SDT_BN) {
        this.SDT_BN = SDT_BN;
    }

    public void setDC_BN(String DC_BN) {
        this.DC_BN = DC_BN;
    }

    public void setMa_Thuoc(String Ma_Thuoc) {
        this.Ma_Thuoc = Ma_Thuoc;
    }
    
    public void SQLConnection() {
      
    }
    
}
