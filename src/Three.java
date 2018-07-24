import java.util.ArrayList;
import java.util.Stack;

public class Three {
	
	
	//����1.��Ҫ��β��ͷ��ӡ������������ջ���ݽṹ���Ƚ����������ʵ�֡�
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
	//����2.���õݹ����������
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
		ArrayList<Integer> result = new ArrayList<>();
		if(listNode!=null){
			//��ǰ�ڵ㲻Ϊ��ʱ�ݹ������һ���ڵ���÷�����ֱ�����һ���ڵ����һ���ڵ�Ϊ��ʱ���ݹ������Ȼ��Ӻ���ǰ�˳�����ʵ�ִӺ���ǰ��ӡ����
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
