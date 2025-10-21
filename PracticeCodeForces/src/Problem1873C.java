import java.util.Scanner;

public class Problem1873C {
    public static void main(String[] args) {
        int[][] score =
                {{1,1,1,1,1,1,1,1,1,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,5,5,4,3,2,1},
                {1,2,3,4,4,4,4,3,2,1},
                {1,2,3,3,3,3,3,3,2,1},
                {1,2,2,2,2,2,2,2,2,1},
                {1,1,1,1,1,1,1,1,1,1}};

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=0;
            char[][] arr = new char[10][10];
            for(int i=0;i<10;i++){
                String line = sc.next();
                for(int j=0;j<10;j++){
                    arr[i][j] = line.charAt(j);
                    }
                }
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    if(arr[i][j] == 'X'){
                        count+=score[i][j];
                    }
                }
            }
            System.out.println(count);
        }
    }
}
