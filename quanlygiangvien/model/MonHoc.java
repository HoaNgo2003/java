package model;

public class MonHoc {
    private int maMH;
    private static int count = 100;
    private String tenMH;
    private int tongSt, tongTietLT, mucKP;
    public MonHoc() {}
    public MonHoc(String tenMH, int tongSt, int tongTietLT, int mucKP) {
        this.tenMH = tenMH;
        this.tongSt = tongSt;
        this.tongTietLT = tongTietLT;
        this.mucKP = mucKP;
        maMH = count++;
    }
    public int getMaMH() {
        return maMH;
    }
    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }
    public String getTenMH() {
        return tenMH;
    }
    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }
    public int getTongSt() {
        return tongSt;
    }
    public void setTongSt(int tongSt) {
        this.tongSt = tongSt;
    }
    public int getTongTietLT() {
        return tongTietLT;
    }
    public void setTongTietLT(int tongTietLT) {
        this.tongTietLT = tongTietLT;
    }
    public int getMucKP() {
        return mucKP;
    }
    public void setMucKP(int mucKP) {
        this.mucKP = mucKP;
    }

}
