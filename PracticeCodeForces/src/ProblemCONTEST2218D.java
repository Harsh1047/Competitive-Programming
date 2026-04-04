    import java.math.BigInteger;
    import java.util.Scanner;

    public class ProblemCONTEST2218D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int n = sc.nextInt();
                int x=0; int y=1;
                int k=1; int l=n-1;
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    if (i % 2 == 0) {
                        arr[i] = k++;
                    } else {
                        arr[i] = l--;
                    }
                }
                int[] gcd = new int[n];
                gcd[0] = arr[0];
                for(int i=1;i<n;i++){
                    gcd[i] = arr[i-1]*arr[i];
                }
                for(int i=0;i<n;i++) System.out.print(gcd[i] + " ");
                System.out.println();
            }
        }
    }
