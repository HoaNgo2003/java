import java.util.Scanner;

public class bai3 {
    public static void xuLy(String s){
        s = s.trim();
        s = s.replaceAll("\\s+", "");
        s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        xuLy(s);
    }
}
