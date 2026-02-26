import java.util.Scanner;

public class Problem227D_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            float n = sc.nextInt();
            float s = sc.nextInt();
            int count=0;
            float k=n;
            for(int i=0;i<n;i++){

                float mod = s/k;
                k--;
                if(mod>5){
                    s-=6;
                    count+=5;

                }
                else {
                    s-=5;
                    count+=6;
                }
//                System.out.println(mod + " " + k);

            }
            System.out.println(count);
        }
    }
}
