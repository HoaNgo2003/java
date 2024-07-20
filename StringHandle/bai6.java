import java.util.Scanner;

public class bai6 {
    public static void xuLy(String s){
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareToIgnoreCase(arr[j]) > 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        xuLy(s);
    }
}
