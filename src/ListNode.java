import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next=next;
    }

    public void nodePrint(){
        //let us make a dummy
        ListNode l3 = new ListNode();
        l3 = this;
        Boolean flag = true;

        while(flag){
            System.out.println(l3.val);
            if(l3.next !=  null)
            {
                l3 = l3.next;
            }
            else{
                flag = false;
            }
        }

    }

}