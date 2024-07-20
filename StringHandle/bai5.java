import java.util.Scanner;

public class bai5 {
    public static void xuLy(String s){
        String ans = "";
        String[] arr = s.split(" ");
        ans = arr[arr.length-1]+" ";
        ans+= arr[0]+" ";
        for(int i = 1; i < arr.length-1; i++){
            ans += arr[i]+" ";
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        xuLy(s);
    }
}
