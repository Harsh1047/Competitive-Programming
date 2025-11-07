import java.util.HashSet;
import java.util.Scanner;

public class Problem1904A {
    public static void main(String[] args) {
        long[] dx = {1, -1, 1, -1};
        long[] dy = {1, 1, -1, -1};

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();
            HashSet<String> kinghits = new HashSet<>();
            HashSet<String> queenhits = new HashSet<>();
            for(int i=0;i<4;i++) {
                kinghits.add((xk + dx[i] * a) + "," + (yk + dy[i] * b));
                kinghits.add((xk + dx[i] * b) + "," + (yk + dy[i] * a));

                queenhits.add((xq + dx[i] * a) + "," + (yq + dy[i] * b));
                queenhits.add((xq + dx[i] * b) + "," + (yq + dy[i] * a));
            }
            int count=0;
            for(String pos:kinghits){
                if(queenhits.contains(pos)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
