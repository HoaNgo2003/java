package run;



import controller.QuanLyKeKhaiGD;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QuanLyKeKhaiGD q = new QuanLyKeKhaiGD();
         while(true){
             System.out.print("""
                     0.exit
                     1. Nhập danh sách môn học mới. In ra danh sách môn học sau khi nhập xong.
                     2. Nhập danh sách giảng viên mới. In ra danh sách GV sau khi nhập xong.
                     3. Lập Bảng kê khai giảng dạy cho mỗi giảng viên và in danh sách ra màn hình.
                     4. Sắp xếp danh sách kê khai giảng dạy: Theo họ tên giảng viên
                     5. Sắp xếp danh sách kê khai giảng dạy: Theo số tiết giảng dạy mỗi môn (giảm dần)
                     6. Tính toán và lập bảng tính tiền công cho mỗi giảng viên.
                     """);
             Scanner sc = new Scanner(System.in);
             int chon = Integer.parseInt(sc.nextLine());
             switch (chon){
                 case 0:
                     return;
                 case 1:
                     q.nhapMonHoc();
                     q.inMH();
                     break;
                 case 2:
                     q.nhapGv();
                     q.inGV();
                     break;
                 case 3:
                     q.nhapKeKhaiGd();
                     q.inLopGd();
                     break;
                 case 4:
                     q.sapXepTheoTenGV();
                     q.inLopGd();
                     break;
                 case 5:
                     q.soTietGV();
                     q.inLopGd();
                     break;
                 case 6:
                     q.tinhLuong();
                     break;
                 default:
                     break;
             }
         }
    }
}