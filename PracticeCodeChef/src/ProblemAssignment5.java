import java.util.Scanner;

public class ProblemAssignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        boolean istrue = true;
        int initial=0;
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]!=0){
                istrue = true;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[n-i-1]==0){
                for(int j=0;j<i;j++){
                    if(arr[j]>=i-j){
                        istrue=true;
                        break;
                    }
                    else{
                        istrue = false;
                    }
                }
            }
        }
        if(istrue){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
