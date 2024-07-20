package controller;

import model.GiangVien;
import model.LopGiangDay;
import model.MonHoc;

import java.util.Scanner;

public class QuanLyKeKhaiGD {
    private GiangVien[] gv = new GiangVien[1000];
    private LopGiangDay[] lgd = new LopGiangDay[1000];
    private int indexLopGD = 0;
    private int indexGV = 0;
    private int indexMH = 0;
    private Scanner sc = new Scanner(System.in);
    private MonHoc[] mh = new MonHoc[1000];
    public QuanLyKeKhaiGD() {}
    public void nhapMonHoc(){
        System.out.println("Nhap so luong mon hoc muon nhap:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String tenMH = sc.nextLine();
            int tsotiet = Integer.parseInt(sc.nextLine());
            int sotietLt = Integer.parseInt(sc.nextLine());
            int kinhPhi = Integer.parseInt(sc.nextLine());
            MonHoc monhoc = new MonHoc(tenMH, tsotiet, sotietLt, kinhPhi);
            mh[indexMH++] = monhoc;
        }
    }
    public GiangVien getGv(int maGV) {
        GiangVien giangvien = new GiangVien();
        for (int i = 0; i < indexGV; i++) {
            if(maGV == gv[i].getMaGV()){
               giangvien = gv[i];
               break;
            }
        }
         return giangvien;
    }
    public MonHoc getMonHoc(int maHoc) {
        for (int i = 0; i < indexMH; i++) {
            if(maHoc==mh[i].getMaMH()){
                return mh[i];
            }
        }
        return new MonHoc();
    }
    public void nhapGv(){
        System.out.println("Nhap do luong giao vien muon nhap moi:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String hoten = sc.nextLine();
            String diachi = sc.nextLine();
            String SDT = sc.nextLine();
            String trinhDo = sc.nextLine();
            GiangVien giangvien = new GiangVien(hoten, diachi, SDT, trinhDo);
            gv[indexGV++] = giangvien;
        }
    }
    public void inGV(){
        System.out.println("Danh sach giang vien:");
        for (int i = 0; i < indexGV; i++) {
            System.out.println(gv[i].getMaGV()+" "+gv[i].getHoTen()+" "+gv[i].getDiachi()+" "+gv[i].getSDT());
        }
    }
    public void inMH(){
        System.out.println("Danh sach cac mon hoc:");
        for (int i = 0; i < indexMH; i++) {
            System.out.println(mh[i].getMaMH()+" "+mh[i].getTenMH()+" "+mh[i].getTongSt());
        }
    }
    public void nhapKeKhaiGd(){
        System.out.println("Nhap giao vien giang day:");
        int maGV = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ma mon hoc:");
        int maMH = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so luong:");
        try {
            int soLuong = Integer.parseInt(sc.nextLine());
            if(soLuong > 3){
                throw new Error("So lop nhan khong duoc lon hon 3");
            }
            int tongtiet = 0;
            for(int i = 0; i < indexLopGD; i++){
                if(maGV == lgd[i].getMaGV()){
                    MonHoc monhoc = getMonHoc(maMH);
                    tongtiet += monhoc.getTongSt()* lgd[i].getSoluong();
                }
            }
            if(tongtiet > 200){
                throw new Error("Tong so tiet giang day khong duoc lon hon 200");
            }
            LopGiangDay l = new LopGiangDay(maMH, maGV, soLuong);
            lgd[indexLopGD++] = l;
        }catch(Error e){
            System.out.println(e);
        }

    }
    public void inLopGd(){
        for(int i = 0; i < indexLopGD; i++){
            GiangVien giangvien = getGv(lgd[i].getMaGV());
            MonHoc monhoc = getMonHoc(lgd[i].getMaMH());
            System.out.println(giangvien.getHoTen()+" "+monhoc.getTenMH()+" "+lgd[i].getSoluong());
        }
    }
    public void sapXepTheoTenGV(){
        for(int i = 0; i < indexLopGD-1; i++){
            for(int j = i+1; j < indexLopGD; j++){
                GiangVien a = getGv(lgd[i].getMaGV());
                GiangVien b = getGv(lgd[j].getMaGV());
                if(a.getHoTen().compareToIgnoreCase(b.getHoTen()) < 0){
                    LopGiangDay tmp = lgd[i];
                    lgd[i] = lgd[j];
                    lgd[j] = tmp;
                }
            }
        }
    }
    public void soTietGV(){
        for(int i = 0; i < indexLopGD; i++){
            for(int j = i+1; j < indexLopGD; j++){
                if(lgd[i].getSoluong()< lgd[j].getSoluong()){
                    LopGiangDay tmp = lgd[i];
                    lgd[i] = lgd[j];
                    lgd[j] = tmp;
                }
            }
        }
    }
    public void tinhLuong(){
        for(int i = 0; i < indexLopGD; i++){
            int luong = 0;
            for(int j = 0 ; j < indexLopGD; j++){
                MonHoc monhoc = getMonHoc(lgd[j].getMaMH());
                if(lgd[i].getMaGV()==lgd[j].getMaGV()){
                    luong += lgd[i].getSoluong()*monhoc.getMucKP();
                }
            }
            GiangVien giangvien = getGv(lgd[i].getMaGV());
            giangvien.setLuong(luong);
        }
        System.out.println("Bang luong:");
        for(int i = 0; i < indexGV; i++){
            System.out.println(gv[i].getMaGV()+" "+gv[i].getHoTen()+" "+gv[i].getDiachi()+" "+gv[i].getSDT()+" "+gv[i].getLuong());
        }
    }

}
