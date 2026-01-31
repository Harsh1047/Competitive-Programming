public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
        Node(int data1){
            this.data = data1;
            this.next = null;
        }
    }
    static Node arr2ll(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static int ll(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.println(head);;
            head = head.next;
        }
    }
    private static int check(Node head, int n){
        Node temp = head;
        while(temp!=null){
            if (temp.data == n) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        Node y = new Node(arr[3]);
//        System.out.println(y.data);
        Node head = arr2ll(arr);
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println(ll(head));
        int n = 7;
        System.out.println(check(head, n));
    }
}
