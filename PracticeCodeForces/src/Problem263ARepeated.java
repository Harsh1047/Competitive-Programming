import java.util.Scanner;

public class Problem263ARepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int total=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]==1) total = i+j;
            }
        }
        System.out.println((Math.abs(total-4)));
    }
}
