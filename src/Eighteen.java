/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 思路：镜像即是左儿子变右儿子，右儿子变左儿子，显然对于树的操作任然是使用递归。
 * */
public class Eighteen {
	
	public void Mirror(TreeNode root) {
        if (root != null) {
			swapChild(root);//先交换儿子
			Mirror(root.left);//递归的让左儿子Mirror
			Mirror(root.right);//递归的让右儿子Mirror
		}
    }
	
	private void swapChild(TreeNode root) {
		//使用一个临时变量来交换位置。
		TreeNode left = null;
		left = root.left;
		root.left = root.right;
		root.right = left;
	}
	
	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    TreeNode(int val) {
	    	this.val = val;
	   }
	}
}
