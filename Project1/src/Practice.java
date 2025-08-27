public class Practice{
    public static void main(String[] args) {
        System.out.println(sumrec(26));
        star1(5);
        fib(50);

    }
    static void fib(int n){
        int n1 = 0;
        int n2 = 1;
        for(int i=0;i<=n-1;i++){
            System.out.print(n1 + " ");
            int n3 = n1+n2;
            n1=n2;
            n2=n3;
        }
    }

    static void star1(int n){
        for(int i = 0;i<n;i++){
            for(int j =0; j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumrec(int n) {
        if(n==1){
            return n;
        }
        else{
            return n + sumrec(n-1);
        }
    }
}

