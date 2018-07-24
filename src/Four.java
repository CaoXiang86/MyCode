
public class Four {
	 
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
		TreeNode(){	}
	}
	//解题思路：
	//1、前序遍历的第一位x肯定是根节点
	//2、中序遍历在x前面的是 左子树的中序遍历，右边是右子树的中序遍历，可以得到左子树的节点个数和右子树的节点个数l，r
	//3、前序遍历1~L位是左子树的前序遍历，所以第1位是根的左儿子，第L+1位是根的右儿子
	//4、再递归的对左儿子当作新的子树右儿子当作新的子树，得到左儿子的左右儿子和右儿子的左右儿子，这样直到叶子为止
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		
		return reConstructBinaryTree(pre, in, 0, pre.length-1, 0, in.length-1);
		
		
	}
	
	public TreeNode reConstructBinaryTree(int[] pre,int[] in,int posPre,int endPre,int posIn,int endIn) {
		//当开始位置大于结束位置时返回null
		if(posPre>endPre || posIn > endIn){
			return null;
		}
		//前序遍历开始的地方永远是根
		TreeNode root = new TreeNode(pre[posPre]);
		
		//根据前序遍历开始的地方是根，所以需要在中序遍历中寻找根的位置，这样可以的到左、右儿子的前序遍历和中序遍历;
		//左子树的个数为i-posIn，右子树的个数为endIn-i，其中i为根在中序遍历中的索引
		//左子树前序遍历的索引为[posPre+1,posPre+左子树个数]，右子树前序遍历的索引为[posPre+左子树个数+1,endPre]
		//左子树中序遍历的索引为[posIn,i-1],右子树中序遍历的索引为[i+1,endIn]
		for(int i = posIn ;i<=endIn;i++){
			if (in[i] == pre[posPre]) {
				root.left = reConstructBinaryTree(pre, in, posPre+1, posPre+i-posIn, posIn, i-1);
				root.right = reConstructBinaryTree(pre, in, posPre+i-posIn+1, endPre, i+1, endIn);
			}
		}
		return root;
	}
}
	
			

