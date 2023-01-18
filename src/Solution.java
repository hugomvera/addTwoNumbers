class Solution{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l3 = new ListNode();
        ListNode head = l3;

        boolean flag10 = false;

        Boolean flag = true;
        int carry =0;


        int counter =0;


        while(flag){
            //adding l3 value
            //checking if is less than 10

            if(l1 == null){
                l1 = new ListNode(0);}
            if(l2 == null){
                l2 = new ListNode(0);		}

            //variable for carry
            counter++;

            //debuggin
            int add = l1.val+l2.val+carry;

            int assinged = 0 ;

            //System.out.print("loop:"+counter);
            //System.out.print("\t the number is "+add+"\n");

            if(add>9 )
            {	//System.out.println("\n\t greater than10");
                assinged = l1.val + l2.val-10+carry;
                //System.out.println("\n \t assinged:"+assinged);
                carry =1;
                if(l1.next == null){
                    l1.next  = new ListNode(0);
                }
            }


            else{
                //System.out.println("\tless than 10");
                assinged = l1.val + l2.val +carry;
                //System.out.println("\n \t assinged:"+assinged);
                carry =0;

            }


            l3.val = assinged;

            //this checks for the null
            if(l1.next !=  null || l2.next!=null)
            {
                l1 = l1.next;
                l2 = l2.next;
                l3.next = new ListNode();
                l3 = l3.next;

            }
            else{
                System.out.println("exiting Both are null");
                flag = false;
            }
        }
        return head;
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