import java.util.Scanner;

public class ProblemP5209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            char[] arr = new char[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.next().charAt(0);
            }
            if(arr.length==3 && arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == '1' || arr.length==2 && arr[0] == arr[1] && arr[1] == '1'){
                System.out.println("No");
            }
            else {
                System.out.println("Yes");
            }
        }
    }
}
