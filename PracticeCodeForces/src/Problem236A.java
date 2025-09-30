import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        String str = sc.next();
        Set<Character> set = new HashSet<>();
        for(int i=0 ; i<str.length() ; i++) set.add(str.charAt(i));
        if(set.size() % 2 != 0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
