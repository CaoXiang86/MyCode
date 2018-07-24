import java.util.ArrayList;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Thirteen {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		reOrderArray(a);
		for(int b:a){
			System.out.println(b);
		}
	}
	
	public static void reOrderArray(int [] array) {
        //从后面向前开始寻找偶数
		for(int i = array.length -2;i>=0;i--){
        	if(array[i]%2 == 0){
        		//从当前偶数开始，向后寻找奇数，当遇到奇数则交换两个的位置
        		for(int j = i+1;j<array.length;j++){
        			if (array[j]%2 == 1) {
						swap(array, j, j-1);
					}
        		}
        	}
        }
     }
	public static void swap(int[] array,int a,int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
