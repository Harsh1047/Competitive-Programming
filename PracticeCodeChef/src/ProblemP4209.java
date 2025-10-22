import java.util.Scanner;

public class ProblemP4209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            boolean is = false;
            int k=0;
            int j=0;
            StringBuilder sb = new StringBuilder(s);
            for(;k<n;k+=2){
            if(s.charAt(k) =='1') {
                is = true;
                break;
            }
            if(s.charAt(k+1) == '2'){
                is = true;
                break;
            }
            }
            if(is){
                for(int i=0;i<n;i+=2){
                    if(s.charAt(i)=='1') {
                        sb.setCharAt(i, '0');
                    }
                }
            }

            else if(is){
                for(int i=1;i<n;i+=2){
                    if(s.charAt(i)=='1') {
                        sb.setCharAt(i, '0');
                    }
                }
            }
            if(sb.toString().contains("1")){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
