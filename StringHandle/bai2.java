import java.util.Scanner;

public class bai2 {
    public static void xuLy(String s){
        s = s.toLowerCase();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(i % 2 == 0){
                ans += Character.toUpperCase(s.charAt(i));
            }else{
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        xuLy(s);
    }
}
