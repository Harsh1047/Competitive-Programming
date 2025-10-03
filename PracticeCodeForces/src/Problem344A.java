import java.util.Scanner;

public class Problem344A {
    public static void main(String[] args) {
        int count=1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        n--;
        while(n-->0){
            String curr = sc.next();
            if(!prev.equals(curr)){
                count++;
            }
            prev = curr;
        }
        System.out.println(count);
    }
}
