class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l3 = new ListNode();
        boolean flag10 = false;
        l3 = l1;

        Boolean flag = true;
        int carry =0;
        int counter =0;

        while(flag){

            //variable for carry
            counter++;

            //debuggin
            int add = l1.val+l2.val+carry;
            int assinged = 0 ;

            System.out.print("loop:"+counter);
            System.out.print("\t the number is "+add+"\n");

            if(add>9 && l1.next!= null )
            {	System.out.println("\n\t greater than10");
                assinged = l1.val + l2.val-10+carry;
                System.out.println("\n \t assinged:"+assinged);
                carry =1;
            }


            else{
                System.out.println("\tless than 10");
                assinged = l1.val + l2.val +carry;
                System.out.println("\n \t assinged:"+assinged);
                carry =0;

            }


            l1.val = assinged;

            //this checks for the null
            if(l1.next !=  null)
            {
                l1 = l1.next;
                l2 = l2.next;

            }
            else{
                flag = false;
            }
        }
        return l3;
    }


    public static void main(String[] args){

        System.out.println("hello");
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(6);




        Solution sl  = new Solution();

        ListNode l3  =  sl.addTwoNumbers(l1,l2);
        l3.nodePrint();




    }

}