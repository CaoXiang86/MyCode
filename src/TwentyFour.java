import java.util.ArrayList;

/**
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
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
	//a是当前路径的节点集合，arraylist是当前路径的集合，sum是当前累计的值的,target为目标值，这个方法略加修改就能变成遍历二叉树所有路径的算法。
	public void path(TreeNode root,ArrayList<ArrayList<Integer>> arrayList,ArrayList<Integer> a,int sum,int target) {
		if (root == null) {
			return;
		}else {
			sum += root.val;//加上当前根的值
			//判断是否到达叶节点，若到达了则开始比较sum和target
			if (root.left ==null && root.right ==null) {
				if (sum == target ) {
					a.add(root.val);
					arrayList.add(new ArrayList<>(a));//这里new一个arraylist 是因为若直接加入a，则是对a的引用，更改a也会更改arraylist中的a；
					a.remove(a.size()-1);
				}
				return;
			}else {
				a.add(root.val);
				path(root.left,arrayList,a,sum,target);
				path(root.right, arrayList, a, sum, target);
				//这里为什么要移去最后一个元素，是因为，在这里我们只用了一个arrlist<integer> a 来记录路径
				//所以退栈时需要移除当前方法a.add(root.val)这一个值。
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
