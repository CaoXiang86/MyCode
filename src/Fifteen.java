/** 
 * ����һ��������ת�����������������Ԫ�ء�
 * ˼·���ͷ����ӡ����һ��˼·,ʹ�õݹ�ͷǵݹ顣
 * */
public class Fifteen {
	//�ݹ�ķ������ݹ���ߵ�����β�ͣ�Ȼ�������õ�ǰ�ڵ����һ���ڵ��nextָ��ǰ�ڵ㣬���Ұѵ�ǰ�ڵ��nextָ��null
	//�����ߵ�����ͷʱ������ͷָ��null
	public ListNode ReverseList(ListNode head) {
		if(head.next==null){
			return head;
		}else {
			ListNode newNode = this.ReverseList(head.next);
			head.next.next = head;//�˷�����head.next = nullǰ�����Ժ�һ��reverseRestList�����Ḳ�ǵ���ֱ���ߵ�����ͷ��
			head.next = null;
			return newNode;
		}
	 }
	//�ǵݹ�ķ���
	public ListNode ReverseList2(ListNode head){
		//��Ҫ�������ڵ㱣�棬��ֹ�������
		ListNode pre = null;
		ListNode next = null;
		if(head == null){
			return null;
		}else {
			while(head!=null){
				next = head.next;//�ȱ��浱ǰ�ڵ����һ���ڵ�
				head.next = pre;//�ѵ�ǰ�ڵ����һ���ڵ�����Ϊ��һ���ڵ�
				pre = head;//����һ���ڵ�����Ϊ��ǰ�ڵ㣬�����е���
				head = next;//�ѵ�ǰ�ڵ�����Ϊ��һ���ڵ�,���е���
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

