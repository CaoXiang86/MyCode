import java.util.Collections;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，
 * 超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 
 * 
 * */
public class TwentyEight {

	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,2,5,2,3};
		TwentyEight twentyEight = new TwentyEight();
		System.out.println(twentyEight.MoreThanHalfNum_Solution(arr));
	}
	
	public int MoreThanHalfNum_Solution(int [] array) {
		int r = 0;
		//在这里只判断前一半多一个元素
		for(int i = 0 ; i < array.length/2+1; i++){
			int result = 0;
			for(int j = i;j<array.length;j++){
    		   if (array[i] == array[j]) {
				result++;
    		   }
    		   if (result > array.length/2) {
    			   r = array[i];
    			   return r ;
    		   }
    		}
    	}
		return r;
	 }
}
