
public class Four {
	 
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
		TreeNode(){	}
	}
	//����˼·��
	//1��ǰ������ĵ�һλx�϶��Ǹ��ڵ�
	//2�����������xǰ����� ������������������ұ�����������������������Եõ��������Ľڵ�������������Ľڵ����l��r
	//3��ǰ�����1~Lλ����������ǰ����������Ե�1λ�Ǹ�������ӣ���L+1λ�Ǹ����Ҷ���
	//4���ٵݹ�Ķ�����ӵ����µ������Ҷ��ӵ����µ��������õ�����ӵ����Ҷ��Ӻ��Ҷ��ӵ����Ҷ��ӣ�����ֱ��Ҷ��Ϊֹ
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		
		return reConstructBinaryTree(pre, in, 0, pre.length-1, 0, in.length-1);
		
		
	}
	
	public TreeNode reConstructBinaryTree(int[] pre,int[] in,int posPre,int endPre,int posIn,int endIn) {
		//����ʼλ�ô��ڽ���λ��ʱ����null
		if(posPre>endPre || posIn > endIn){
			return null;
		}
		//ǰ�������ʼ�ĵط���Զ�Ǹ�
		TreeNode root = new TreeNode(pre[posPre]);
		
		//����ǰ�������ʼ�ĵط��Ǹ���������Ҫ�����������Ѱ�Ҹ���λ�ã��������Եĵ����Ҷ��ӵ�ǰ��������������;
		//�������ĸ���Ϊi-posIn���������ĸ���ΪendIn-i������iΪ������������е�����
		//������ǰ�����������Ϊ[posPre+1,posPre+����������]��������ǰ�����������Ϊ[posPre+����������+1,endPre]
		//�������������������Ϊ[posIn,i-1],�������������������Ϊ[i+1,endIn]
		for(int i = posIn ;i<=endIn;i++){
			if (in[i] == pre[posPre]) {
				root.left = reConstructBinaryTree(pre, in, posPre+1, posPre+i-posIn, posIn, i-1);
				root.right = reConstructBinaryTree(pre, in, posPre+i-posIn+1, endPre, i+1, endIn);
			}
		}
		return root;
	}
}
	
			

