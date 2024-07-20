import java.util.Scanner;

public class bai1 {
    public static boolean checkTn(int n){
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 100000; i < 1000000; i++){
            if(checkTn(i)){
                System.out.println(i+" ");
            }
        }
    }
}
