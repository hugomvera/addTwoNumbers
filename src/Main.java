public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        System.out.println("hello");
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);


        l1.nodePrint();

    }
}