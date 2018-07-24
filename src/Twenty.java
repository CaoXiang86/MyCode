import java.util.Iterator;
import java.util.Stack;
/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min������
 * */
public class Twenty {
	Stack<Integer> stack;
	
	public void push(int node) {
        stack.add(node);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        int min = stack.peek();
        Iterator<Integer> iterator = stack.iterator();
        if (iterator.hasNext()) {
			int temp = iterator.next();
			if (temp<min) {
				min = temp;
			}
		}
        return min;
    }
}
