import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 * ˼·�����Ĳ�α���������һ���������ý�����еĶ������ν�����С�
 * */
public class TwentyTwo {
	
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		if (root == null) {
			return arrayList;
		}
		//�����������ýڵ�һ��һ����Ӻͳ���
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			//�����в�Ϊ�վ��ö����е�Ԫ�����γ���
			TreeNode treeNode = queue.poll();
			arrayList.add(treeNode.val);
			//�����ӵĽڵ��������ӻ����Ҷ��� ���ö����ǽ�����С�
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
