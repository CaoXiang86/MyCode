/** 
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 * 思路：因为是两个递增的链表合并，这和归并排序的思路很像，选择一个指针A指向一个链表头，另一个指针B在另一个链表上移动，
 * 当B指向节点大于A时，B停止并且把B节点的上一个节点.next指向A，然后A开始移动
 * 在A指向节点大于B时，A停止并且把A节点的上一个节点.next指向B 然后B开始移动，直到某一个链表遍历完成，把另一个链表剩下的拷贝进去。
 * 
 * 策略：因为在上面是做着同样的逻辑，所以可以考虑使用递归的方法，因为每一次merge方法调用 返回的都是两个链表头较小的值
 * */
public class Sixteen {
	
	class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	
	public ListNode Merge(ListNode list1,ListNode list2) {
       if(list1 ==null){
    	   return list2;
       }else {
    	   if(list2 ==null) {
    		   return list1;
    	   }else{
	    	   //把每一次合并的链表较小的头指向合并下一个链表的头。
	    	   if(list1.val <= list2.val){
	    		   list1.next = Merge(list1.next, list2);
	    		   return list1;
	    	   }else {
	    		   list2.next = Merge(list1, list2.next);
	    		   return list2;
	    	   }
    	   }
       }
	}	
}
