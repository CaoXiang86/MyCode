import java.util.ArrayList;

/**
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * 
 * */
public class TwentyFour {
	
	public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();
		if (root ==null) {
			return arrayList;
		}else {
			int sum = 0;
			path(root, arrayList, list, sum, target);
			return arrayList;
		}
		
		
    }
	//a�ǵ�ǰ·���Ľڵ㼯�ϣ�arraylist�ǵ�ǰ·���ļ��ϣ�sum�ǵ�ǰ�ۼƵ�ֵ��,targetΪĿ��ֵ����������Լ��޸ľ��ܱ�ɱ�������������·�����㷨��
	public void path(TreeNode root,ArrayList<ArrayList<Integer>> arrayList,ArrayList<Integer> a,int sum,int target) {
		if (root == null) {
			return;
		}else {
			sum += root.val;//���ϵ�ǰ����ֵ
			//�ж��Ƿ񵽴�Ҷ�ڵ㣬����������ʼ�Ƚ�sum��target
			if (root.left ==null && root.right ==null) {
				if (sum == target ) {
					a.add(root.val);
					arrayList.add(new ArrayList<>(a));//����newһ��arraylist ����Ϊ��ֱ�Ӽ���a�����Ƕ�a�����ã�����aҲ�����arraylist�е�a��
					a.remove(a.size()-1);
				}
				return;
			}else {
				a.add(root.val);
				path(root.left,arrayList,a,sum,target);
				path(root.right, arrayList, a, sum, target);
				//����ΪʲôҪ��ȥ���һ��Ԫ�أ�����Ϊ������������ֻ����һ��arrlist<integer> a ����¼·��
				//������ջʱ��Ҫ�Ƴ���ǰ����a.add(root.val)��һ��ֵ��
				a.remove(a.size()-1);
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
