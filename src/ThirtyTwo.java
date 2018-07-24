import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 * 思路：得到数组的所有排列组合，然后再比较大小
 * 
 * */
public class ThirtyTwo {
	
	public static void main(String[] args) {
		int[] a={3334,3,3333332};
		List<Long> result = new ArrayList<>();
		helper(a, 0, result);
		for(Long integer:result){
			System.out.println(integer.toString());
		}
		
		
	}
	
	public String PrintMinNumber(int [] numbers) {
		if (numbers.length == 0) {
			return null;
		}else {
			List<Long> result = new ArrayList<>();
			
			helper(numbers, 0, result);
			Long min = result.get(0);
			for(Long integer:result){
				if (integer < min) {
					min = integer;
				}
			}
			String string = min.toString();
			return string;
		}
	}
	private static void swap(int[] array,int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	//利用回朔法得到数组的所有排列组合。
	private static void helper(int[] cs,int index,List<Long> result) {
		//这是指是否到数组的最后一位，当到最后一位是即最深位置，此时应判断结果集中是否存在该状态(即是否达到目的)
		if (index == cs.length-1) {
			StringBuffer stringBuffer = new StringBuffer();
			for(int i = 0 ; i < cs.length;i++){
				stringBuffer.append(cs[i]);
			}
			Long integer = Long.valueOf(stringBuffer.toString());
			if (!result.contains(integer)) {
				result.add(integer);
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
	
}
