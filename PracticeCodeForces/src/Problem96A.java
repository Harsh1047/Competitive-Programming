import java.util.Scanner;

public class Problem96A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            boolean istrue = false;
            int count = 0;
            String str = sc.next();
            for(int i=1;i<str.length();i++){
                if(str.charAt(i-1) == str.charAt(i)){
                    count++;
                    if(count==6){
                        istrue = true;
                        break;
                    }
                }
                else{
                    count = 0;
                }
            }
            if(istrue){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

