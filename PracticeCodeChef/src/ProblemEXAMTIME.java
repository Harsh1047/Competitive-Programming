import java.util.Scanner;

public class ProblemEXAMTIME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int ddsa = sc.nextInt();
            int dtoc = sc.nextInt();
            int ddm = sc.nextInt();
            int sdsa = sc.nextInt();
            int stoc = sc.nextInt();
            int sdm = sc.nextInt();
            int dtotal = ddsa+ddm+dtoc;
            int stotal = sdsa+stoc+sdm;
            if(dtotal==stotal) {
                if (ddsa == sdsa) {
                    if (dtoc == stoc) System.out.println("Tie");
                    else if (dtoc > stoc) System.out.println("Dragon");
                    else System.out.println("Sloth");
                }
                else if (ddsa > sdsa) System.out.println("Dragon");
                else System.out.println("Sloth");
            }
            else if(dtotal>stotal) System.out.println("Dragon");
            else System.out.println("Sloth");

        }
    }
}
