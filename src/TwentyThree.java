/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * 
 * 思路：二叉树的后序遍历序列的最后一个元素永远是根元素，所以由BST的性质，左子树的元素小于根，右子树的元素大于根，
 * 所以可以找到左子树序列和右子树序列，然后再递归的把左右子树序列当新的序列进行判断，直到只有叶节点或者没有左/右子树
 * 
 * 策略：对于需要递归的遍历一个序列，最好是加上start索引和end索引，然后递归的更改start和end，而不是更改序列本身。
 * */
public class TwentyThree {
	
	public static void main(String[] args) {
		
		int[] sequence = {7,4,6,5};
		System.out.println(VerifySquenceOfBST(sequence));
	}
	
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if (sequence.length == 0) {
			return false;
		}else {
			return judge(sequence, 0, sequence.length-1);
		}
	}
	public static boolean judge(int[] sequence,int start,int end) {
		//判断序列的起始位置，和结束位置的相对位置
		if (start >= end) {
			return true;
		}else {
			//建立一个局部变量，来储存后序遍历的左子树序列的结束位置
			int i = end-1;
			//右子树序列都应该比根大，所以从后向前遍历，直到出现比根小的时候，此时的i为左子树的结束位置。
			while(sequence[i] > sequence[end]){
				i--;
			}
			for(int j = i;j>=start;j--){
				if(sequence[j] >= sequence[end]){
					return false;
				}
			}
			//递归的判断左子树和右子树，只有两个都返回true时才返回true；
			return judge(sequence, start, i) && judge(sequence, i+1, end-1);
		}
	}
}
