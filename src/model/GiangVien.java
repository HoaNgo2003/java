package model;

public class GiangVien {
    private static int count = 100;
    private String hoTen, diachi, SDT, trinhDo;
    private int luong;
    private int maGV;
    public GiangVien() {}
    public GiangVien(String hoTen, String diachi, String SDT, String trinhDo) {
        maGV = count++;
        this.hoTen = hoTen;
        this.diachi = diachi;
        this.SDT = SDT;
        this.trinhDo = trinhDo;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public String getSDT() {
        return SDT;
    }
    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    public String getTrinhDo() {
        return trinhDo;
    }
    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    public int getMaGV() {
        return maGV;
    }
    public void setMaGV(int maGV) {
        this.maGV = maGV;
    }

    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
}
