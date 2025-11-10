import java.util.Scanner;

public class Problem1837B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int count=1;
            int maxcount=1;
            int n = sc.nextInt();
            String str = sc.next();
            for(int i=0;i<n-1;i++){
                if(str.charAt(i)==str.charAt(i+1)) count++;
                else{
                    maxcount = Math.max(count,maxcount);
                    count=1;
                }
                maxcount = Math.max(count,maxcount);
            }
            System.out.println(maxcount+1);
        }
    }
}
