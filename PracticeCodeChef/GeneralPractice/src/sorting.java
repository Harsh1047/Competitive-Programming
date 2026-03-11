public class sorting {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int i=0;i<5;i++) System.out.print(arr[i]+" ");

        // --------------------SELECTION SORT--------------------
//        for(int i=0;i<5;i++){
//            int min=i;
//            for(int j=i+1;j<5;j++){
//                if(arr[j]<arr[min]) min = j;
//            }
//            int temp = arr[i];
//            arr[i] = arr[min];
//            arr[min] = temp;
//        }
        System.out.println();
        for(int i=0;i<5;i++) System.out.print   (arr[i]+" ");

        // --------------------INSERTION SORT--------------------
//        for(int i=0;i<5;i++){
//            int j=i;
//            while(j>0 && arr[j-1]>arr[j]){
//                int temp = arr[j-1];
//                arr[j-1] = arr[j];
//                arr[j] = temp;
//                j--;
//            }
//        }
        System.out.println();
        for(int i=0;i<5;i++) System.out.print(arr[i]+" ");

        // --------------------BUBBLE SORT--------------------
//        for(int i=0;i<5;i++){
//            for(int j=0;j<4;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        System.out.println();
        for(int i=0;i<5;i++) System.out.print(arr[i]+" ");
    }

}
