import java.util.Scanner;

public class Problem139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int day=1;
        while(n>0){
            if(n>arr[i]){
                if(day==7){
                    day=1;
                    n-=arr[i];
                }
                else {
                    day++;
                    n-=arr[i];
                }
            }
            else{
                System.out.println(day);
                break;
            }
            i = (i + 1) % 7;
        }

    }
}
