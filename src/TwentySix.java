import java.util.Stack;



/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 * 
 * 思路：中序遍历，不过需要更改中序遍历当前元素与前一个元素的指针。
 * */
public class TwentySix {

	public TreeNode ConvertBSTToBiList(TreeNode root) {
        if(root==null)
            return null;
        //二叉树的中序遍历的非递归方法，用一个辅助栈来实现
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        TreeNode pre = null;// 用于保存中序遍历序列的上一节点
        boolean isFirst = true;//用来取出链表的头结点
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);//依次把左儿子压入栈中；
                p = p.left;
            }
            p = stack.pop();//取出最左边的叶节点，也就是链表头
            if(isFirst){
                root = p;// 将中序遍历序列中的第一个节点记为root
                pre = root;
                isFirst = false;
            }else{
                pre.right = p;//修改上一个节点的指针
                p.left = pre;
                pre = p;//记录上一个节点
            }      
            p = p.right;//把下一个节点设置为p的右边。
        }
        return root;
    }
	
	
	
	
	
	
	
	
	
	
	public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree!= null) 
        {
        	TreeNode leftChild = pRootOfTree.left;
			TreeNode rightChild = pRootOfTree.right;
			pRootOfTree.left = leftMax(pRootOfTree);
			pRootOfTree.right = rightMin(pRootOfTree);
			if (leftMax(pRootOfTree) != null) {
				leftMax(pRootOfTree).right = pRootOfTree;
			}
			if (rightMin(pRootOfTree)!=null) {
				rightMin(pRootOfTree).left = pRootOfTree;
			}
			
			Convert(leftChild);
			Convert(rightChild);
		}
        
        return pRootOfTree;
    }
	private TreeNode leftMax(TreeNode root) {
		if (root.left != null) {
			TreeNode leftChild = root.left;
			while(leftChild.right != null){
				leftChild= leftChild.right;
			}
			return leftChild;
		}else {
			return null;
		}
	}
	
	private TreeNode rightMin(TreeNode root) {
		if (root.right != null) {
			TreeNode rightChild = root.right;
			while(rightChild.left != null){
				rightChild= rightChild.left;
			}
			return rightChild;
		}else {
			return null;
		}
	}
	class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
}
