import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        while(s1.indexOf(s2) != -1) {
            s1 = s1.replaceAll(s2, "");
        }
        System.out.println(s1);
    }
}
