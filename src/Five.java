import java.util.Stack;

public class Five {
	 Stack<Integer> stack1 = new Stack<Integer>();
	 Stack<Integer> stack2 = new Stack<Integer>();
	 //要用两个栈形成队列，根据栈为先进后出队列的性质来构建 先进先出队列，则通过两次入栈把队尾压进栈底，把队头放在栈顶即可。
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
