import java.util.Collections;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ�
 * �������鳤�ȵ�һ�룬������2����������������0��
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
		//������ֻ�ж�ǰһ���һ��Ԫ��
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
