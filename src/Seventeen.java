/**
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
 * ˼·���������Ĳ���ͨ������ʹ�õݹ������У����ҵ�A���Ƿ����B�ڵ㣬�����ڣ�����Ǹ��ڵ㿪ʼ�ж�����������������������B��
 * 
 **/
public class Seventeen {
	
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean flag = false;
        if (root1!=null && root2!=null) {
			if (root1.val ==root2.val) {
				//���������ڵ����ʱ���Ӹ�ȥѰ��root2�Ƿ�Ϊroot2���ӽṹ;
				flag = isSubTree(root1, root2);
			}
			if (!flag) {
				//����ڵ㲻��Ȼ���û�ҵ����������ӿ�ʼѰ��ֱ�����ڽڵ���root2���
				flag = HasSubtree(root1.left, root2);
			}
			if (!flag) {
				//��������û�ҵ����Ҷ��ӿ�ʼѰ�ң�
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
