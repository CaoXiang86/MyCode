import java.util.Stack;

public class Five {
	 Stack<Integer> stack1 = new Stack<Integer>();
	 Stack<Integer> stack2 = new Stack<Integer>();
	 //Ҫ������ջ�γɶ��У�����ջΪ�Ƚ�������е����������� �Ƚ��ȳ����У���ͨ��������ջ�Ѷ�βѹ��ջ�ף��Ѷ�ͷ����ջ�����ɡ�
	 public void push(int node) {
		 stack1.push(node);       
	 }
	    
	 public int pop() {
		if (stack1.isEmpty()) {
			return 0;
		}else {
			if (stack1.size() == 1) {
				return stack1.pop();
			}else {
				while(!stack1.isEmpty()){
					stack2.push(stack1.pop());
				}
				return stack2.pop();
			}
		}
	 }
}
