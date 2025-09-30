import java.util.Scanner;

public class Problem263A {
    public static void main(String[] args) {
        int count = 0;
        int row = 0;
        int column = 0;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(arr[i][j] == 1){
                    row = i;
                    column = j;
                }
            }
        }
        if(row < 2){
            int addInRow1 = 2 - row;
            count = count + addInRow1;
        }
        else if(row > 2){
            int addInRow2 = row - 2;
            count = count + addInRow2;
        }
        if(column < 2){
            int addInColumn1 = 2 - column;
            count = count + addInColumn1;
        }
        else if(column > 2){
            int addInColumn2 = column - 2;
            count = count + addInColumn2;
        }
        System.out.println(count);
    }
}
