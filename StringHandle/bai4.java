import java.util.Scanner;

public class bai4 {
    public static void xuLy(String s){
        String[] arr = s.split(" ");
        int maxLeng = 0;
        String word = "";
        for(int i=0; i<arr.length; i++){
            if(arr[i].length() > maxLeng){
                maxLeng = arr[i].length();
                word = arr[i];
            }
        }
        int index = s.indexOf(word);
        System.out.println("tu co do dai lon nhat la "+word+ " nam o vi tri "+index);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        xuLy(s);
    }
}
