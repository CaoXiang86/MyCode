import java.util.ArrayList;

/**
 * HZ偶尔会拿些专业问题来忽悠那些非计算机专业的同学。今天测试组开完会后,
 * 他又发话了:在古老的一维模式识别中,常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
 * 但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。你会不会被他忽悠住？(子向量的长度至少是1)
 * 
 * */
public class Thirty {

	public int FindGreatestSumOfSubArray(int[] array) {
        int max = indexAdd(array, 0);
        //从0开始迭代，来判断每个索引上能累加的最大值，即为子向量中最大和。
		for (int i = 1; i < array.length; i++) {
			int result = indexAdd(array, i);
			if (result > max) {
				max = result;
			}
		}
		return max;
		
    }
	
	//判断从第index开始累加，并返回累加时的最大数值。
	public int indexAdd(int[] array, int index) {
		int sum = 0;
		int max = array[index];
		for(int i = index; i<array.length ;i++){
			sum+= array[i];
			if(sum > max){
				max = sum;
			}
		}
		return max;
	}
}
