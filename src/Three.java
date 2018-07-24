import java.util.ArrayList;
import java.util.Stack;

public class Three {
	
	
	//方法1.想要从尾到头打印链表，可以利用栈数据结构，先进后出队列来实现。
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> result = new ArrayList<>();
		while(listNode!=null){
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		
		while(!stack.isEmpty()){
			result.add(stack.pop());
		}
		return result;
	}
	//方法2.利用递归来进行完成
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
		ArrayList<Integer> result = new ArrayList<>();
		if(listNode!=null){
			//当前节点不为空时递归的让下一个节点调用方法，直到最后一个节点的下一个节点为空时，递归结束，然后从后往前退出方法实现从后往前打印链表；
			this.printListFromTailToHead2(listNode.next);
			result.add(listNode.val);
		}
		return result;
	}
	 class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
}
