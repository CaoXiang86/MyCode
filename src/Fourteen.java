import java.util.ArrayList;

/**
 * ����һ����������������е�����k�����
 * ˼·��
 * ����1���ȷ����ӡ����Ȼ������k������˳����k��
 * ����2������ָ�룬ͬʱָ��ͷ��㣬��һ��ָ�뿪ʼ�ƶ���������k-1��ʱ������ָ��ͬʱ�ƶ�������һ��ָ�뵽β��ʱ���ڶ���ָ���ʱָ������k���ڵ�
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
	
	
	//����1���ȷ����ӡ����Ȼ������k������˳����k��
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
	//����2������ָ�룬ͬʱָ��ͷ��㣬��һ��ָ�뿪ʼ�ƶ���������k+1��ʱ������ָ��ͬʱ�ƶ�������һ��ָ�뵽β��ʱ���ڶ���ָ���ʱָ������k���ڵ�
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
