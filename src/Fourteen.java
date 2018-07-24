import java.util.ArrayList;

/**
 * 输入一个链表，输出该链表中倒数第k个结点
 * 思路：
 * 方法1：先反向打印链表，然后倒数第k个就是顺数第k个
 * 方法2：两个指针，同时指到头结点，第一个指针开始移动，当到第k-1个时，两个指针同时移动，当第一个指针到尾巴时，第二个指针此时指向倒数第k个节点
 * */
public class Fourteen {
	
	public static void main(String[] args) {
		Fourteen fourteen = new Fourteen();
		ListNode listNode1 = fourteen.new ListNode(1);
		ListNode listNode2 = fourteen.new ListNode(2);
		ListNode listNode3 = fourteen.new ListNode(3);
		ListNode listNode4 = fourteen.new ListNode(4);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = null;
		System.out.println(fourteen.FindKthToTail2(listNode1, 3).val);
		
	}
	
	
	//方法1：先反向打印链表，然后倒数第k个就是顺数第k个
	public ListNode FindKthToTail(ListNode head,int k) {
		ArrayList<ListNode> arrayList = reStoreFromTail(head);
		return arrayList.get(k-1);
    }
	
	ArrayList<ListNode> arrayList = new ArrayList<>();
	public ArrayList<ListNode> reStoreFromTail(ListNode head){
		
		if(head != null){
			this.reStoreFromTail(head.next);
			arrayList.add(head);
		}
		return arrayList;
	}
	//方法2：两个指针，同时指到头结点，第一个指针开始移动，当到第k+1个时，两个指针同时移动，当第一个指针到尾巴时，第二个指针此时指向倒数第k个节点
	public ListNode FindKthToTail2(ListNode head,int k){
		ListNode head2 = head;
		int count = 1;
		while(head.next!=null){
			head = head.next;
			count++;
			if(count>k){
				head2 = head2.next;
			}
		}
		return head2;
	}
	
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}
