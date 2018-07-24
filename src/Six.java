
public class Six {
	//思路：因为原始序列是非递减的，所以原始序列的第一个是永远为最小的值，当旋转过后，若出现了前一个值大于后面一个值时，则后面这个元素为元素组最小值
	public int minNumberInRotateArray(int [] array){
		//此时数组所有值都为同一个值，所以直接返回任意一个值即可；
		int result = 0;
		if(array[0] == array[array.length-1]){
			result = array[0];
		}else{
			//遍历数组，当出现当前值大于后面的值时则返回。
			for(int i = 0; i <array.length-2;i++){
				if(array[i]>array[i+1]){
					result = array[i+1];
					break;
				}
			}
			//若数组没有旋转，则result == 0
			if(result == 0){
				result = array[0];
			}
		}
		return result;
	}
}
