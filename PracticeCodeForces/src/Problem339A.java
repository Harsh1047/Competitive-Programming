import java.util.Arrays;
import java.util.Scanner;

public class Problem339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j=0;
        String str = sc.next();
        int arr[] = new int[(str.length()/2) + 1];
        for(int i=0;i<str.length();i+=2){
            arr[j] = Integer.parseInt(String.valueOf(str.charAt(i)));
            j++;
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
            sb.append("+");
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }
}
