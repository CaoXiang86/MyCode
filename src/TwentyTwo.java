import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 思路：树的层次遍历，借助一个队列来让进入队列的儿子依次进入队列。
 * */
public class TwentyTwo {
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		if (root == null) {
			return arrayList;
		}
		//借助队列来让节点一个一个入队和出队
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			//当队列不为空就让队列中的元素依次出队
			TreeNode treeNode = queue.poll();
			arrayList.add(treeNode.val);
			//若出队的节点存在左儿子或者右儿子 则让儿子们进入队列。
			if (treeNode.left!=null) {
				queue.add(treeNode.left);
			}
			if (treeNode.right!=null) {
				queue.add(treeNode.right);
			}
		}
		
		return arrayList;
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
