import java.util.Scanner;

public class Hashing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }
        while(q-->0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}
