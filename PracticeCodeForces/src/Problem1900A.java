import java.util.Scanner;

public class Problem1900A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean istwo = false;
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String str = sc.next();
            for(int i=1;i<n-1;i++){
                char c1 = str.charAt(i-1);
                char c2 = str.charAt(i);
                char c3 = str.charAt(i+1);
                if(c1 == c2 && c2 == c3 && c1=='.' && c2=='.' && c3=='.'){
                    System.out.println(2);
                    istwo = true;
                    break;
                }
            }
            if(!istwo){
                for(int k=0;k<n;k++){
                    if(str.charAt(k) == '.'){
                        count++;
                    }
                }
                System.out.println(count);
            }
            istwo = false;
            count=0;
        }
    }
}
