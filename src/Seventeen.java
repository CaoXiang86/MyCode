/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 思路：对于树的操作通常都是使用递归来进行，先找到A中是否存在B节点，若存在，则从那个节点开始判断左子树或者右子树包含树B。
 * 
 **/
public class Seventeen {
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag = false;
        if (root1!=null && root2!=null) {
			if (root1.val ==root2.val) {
				//当两个根节点相等时，从根去寻找root2是否为root2的子结构;
				flag = isSubTree(root1, root2);
			}
			if (!flag) {
				//如果节点不相等或者没找到，则从左儿子开始寻找直到存在节点与root2相等
				flag = HasSubtree(root1.left, root2);
			}
			if (!flag) {
				//如果左儿子没找到则右儿子开始寻找；
				flag = HasSubtree(root1.right, root2);
			}
		}        
        return flag;
   }
	private boolean isSubTree(TreeNode root1,TreeNode root2) {
		if (root2 == null) {
			return true;
		}else if (root1 ==null) {
			return false;
		}else { 
			if (root1.val != root2.val) {
				return false;
			}else {
				return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
			}
		}
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
