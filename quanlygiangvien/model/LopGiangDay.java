package model;

public class LopGiangDay{
   private int  maMH;
   private int maGV;
   private int  soluong;
   public LopGiangDay(){}
   public LopGiangDay(int maMH, int maGV, int  soluong){
       this.maMH = maMH;
       this.maGV = maGV;
       this.soluong = soluong;
   }
   public int getMaMH() {
       return maMH;
   }
   public void setMaMH(int maMH) {
       this.maMH = maMH;
   }
   public int getMaGV() {
       return maGV;
   }
   public void setMaGV(int maGV) {
       this.maGV = maGV;
   }
   public int getSoluong() {
       return soluong;
   }
}
