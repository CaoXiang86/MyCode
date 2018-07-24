/** 
 * 输入一个链表，反转链表后，输出链表的所有元素。
 * 思路：和反向打印链表一个思路,使用递归和非递归。
 * */
public class Fifteen {
	//递归的方法，递归的走到链表尾巴，然后依次让当前节点的下一个节点的next指向当前节点，并且把当前节点的next指向null
	//便于走到链表头时让链表头指向null
	public ListNode ReverseList(ListNode head) {
		if(head.next==null){
			return head;
		}else {
			ListNode newNode = this.ReverseList(head.next);
			head.next.next = head;//此方法在head.next = null前，所以后一个reverseRestList方法会覆盖掉，直到走到链表头。
			head.next = null;
			return newNode;
		}
	 }
	//非递归的方法
	public ListNode ReverseList2(ListNode head){
		//需要这两个节点保存，防止链表断裂
		ListNode pre = null;
		ListNode next = null;
		if(head == null){
			return null;
		}else {
			while(head!=null){
				next = head.next;//先保存当前节点的下一个节点
				head.next = pre;//把当前节点的下一个节点设置为上一个节点
				pre = head;//把上一个节点设置为当前节点，来进行迭代
				head = next;//把当前节点设置为下一个节点,进行迭代
			}
			return pre;
		}
	}
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
}

