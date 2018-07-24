import java.util.Iterator;
import java.util.Stack;
/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
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
