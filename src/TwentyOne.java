import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是
 * 该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * 思路：用一个辅助栈来完成。 
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
		//把popA序列中每个元素逐个压入辅助栈中
		a:for (int j = 0; j < popA.length; j++) {
			stack2.add(popA[j]);
			//把pushA序列中每个元素压入栈中，若遇到与辅助栈相等时，则同时弹出，并跳出循环
			b:for (int i = m; i < pushA.length; i++) {
				stack.push(pushA[i]);
				if(stack.peek() == stack2.peek()) {
					stack.pop();
					stack2.pop();
					m=i+1;
					break b;
				}
			}
			//表示pushA中的元素已经全部压入过栈中。
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
		//最后判断stack是否为空栈来得到结果
		return stack.isEmpty();
    }
}
