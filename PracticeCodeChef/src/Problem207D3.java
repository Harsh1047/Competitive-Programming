import java.util.Scanner;

public class Problem207D3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            for (int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                    if(str.charAt(i) == str.charAt(j) && str.charAt(i) == '1' && str.charAt(j) == '1'){
                        count = count + j - i;
                    }
                }
            }
            System.out.println(count-1);
        }
    }
}
