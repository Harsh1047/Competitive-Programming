import java.util.Scanner;

public class Problem236ARepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        int[] hash = new int[27];
        for(int i=0;i<s.length();i++) hash[s.charAt(i)-'a']++;
        for(int i=0;i<27;i++){
            if(hash[i]>0){
                count++;
            }
        }
        if(count%2!=0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
