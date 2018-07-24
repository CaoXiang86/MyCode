import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳������4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ�������
 * ��ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * ˼·����һ������ջ����ɡ� 
 * */
public class TwentyOne {
	
	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,5,3,2,1};
		System.out.println(IsPopOrder(pushA, popA));
	}
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		int m = 0;
		//��popA������ÿ��Ԫ�����ѹ�븨��ջ��
		a:for (int j = 0; j < popA.length; j++) {
			stack2.add(popA[j]);
			//��pushA������ÿ��Ԫ��ѹ��ջ�У��������븨��ջ���ʱ����ͬʱ������������ѭ��
			b:for (int i = m; i < pushA.length; i++) {
				stack.push(pushA[i]);
				if(stack.peek() == stack2.peek()) {
					stack.pop();
					stack2.pop();
					m=i+1;
					break b;
				}
			}
			//��ʾpushA�е�Ԫ���Ѿ�ȫ��ѹ���ջ�С�
			if(m >= pushA.length){
				if (!stack.isEmpty() && !stack2.isEmpty()) {
					if(stack.peek() == stack2.peek()) {
						stack.pop();
						stack2.pop();	
					}else {
						return false;
					}
				}
			}
		}
		//����ж�stack�Ƿ�Ϊ��ջ���õ����
		return stack.isEmpty();
    }
}
