import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 
 * 思想：利用回朔法思想，来进行枚举。
 * 是一种深度搜索优先，先搜索到底，达到目的则还原到上一层状态，然后再进行下一次搜索，每一层搜索完都退回到上一层的状态。
 * */
public class TwentySeven {
	
	public ArrayList<String> Permutation(String str) {
		ArrayList<String> list = new ArrayList<>();
		char[] cs = str.toCharArray();
		if (str != null && str.length()>0) {
			helper(cs, 0, list);
			Collections.sort(list);
		}
		return list;
	}
	
	private void helper(char[] cs,int index,List<String> result) {
		//这是指是否到数组的最后一位，当到最后一位是即最深位置，此时应判断结果集中是否存在该状态(即是否达到目的)
		if (index == cs.length-1) {
			String string = String.valueOf(cs);//静态方法，直接将字符数组转换为String
			if (!result.contains(string)) {
				result.add(string);
			}
		}else{//若没有达到最深层
			//从指定位置开始遍历
			for(int i = index;i<cs.length;i++){
				swap(cs,i,index);//交换i和index的位置
				helper(cs, index+1, result);//逐层前进
				swap(cs,i,index);//回溯，退回到上一层的状态
			}
			
		}
	}
	public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
	
	
	
	
	
}
