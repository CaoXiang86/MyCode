import java.util.Stack;



/**
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * 
 * ˼·�����������������Ҫ�������������ǰԪ����ǰһ��Ԫ�ص�ָ�롣
 * */
public class TwentySix {

	public TreeNode ConvertBSTToBiList(TreeNode root) {
        if(root==null)
            return null;
        //����������������ķǵݹ鷽������һ������ջ��ʵ��
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        TreeNode pre = null;// ���ڱ�������������е���һ�ڵ�
        boolean isFirst = true;//����ȡ�������ͷ���
        while(p!=null||!stack.isEmpty()){
            while(p!=null){
                stack.push(p);//���ΰ������ѹ��ջ�У�
                p = p.left;
            }
            p = stack.pop();//ȡ������ߵ�Ҷ�ڵ㣬Ҳ��������ͷ
            if(isFirst){
                root = p;// ��������������еĵ�һ���ڵ��Ϊroot
                pre = root;
                isFirst = false;
            }else{
                pre.right = p;//�޸���һ���ڵ��ָ��
                p.left = pre;
                pre = p;//��¼��һ���ڵ�
            }      
            p = p.right;//����һ���ڵ�����Ϊp���ұߡ�
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
