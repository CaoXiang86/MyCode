/**
 * ���������Ķ�����������任ΪԴ�������ľ���
 * ˼·������������ӱ��Ҷ��ӣ��Ҷ��ӱ�����ӣ���Ȼ�������Ĳ�����Ȼ��ʹ�õݹ顣
 * */
public class Eighteen {
	
	public void Mirror(TreeNode root) {
        if (root != null) {
			swapChild(root);//�Ƚ�������
			Mirror(root.left);//�ݹ���������Mirror
			Mirror(root.right);//�ݹ�����Ҷ���Mirror
		}
    }
	
	private void swapChild(TreeNode root) {
		//ʹ��һ����ʱ����������λ�á�
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
