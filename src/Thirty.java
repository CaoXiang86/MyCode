import java.util.ArrayList;

/**
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,
 * ���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
 * ����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
 * ����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)����᲻�ᱻ������ס��(�������ĳ���������1)
 * 
 * */
public class Thirty {

	public int FindGreatestSumOfSubArray(int[] array) {
        int max = indexAdd(array, 0);
        //��0��ʼ���������ж�ÿ�����������ۼӵ����ֵ����Ϊ�����������͡�
		for (int i = 1; i < array.length; i++) {
			int result = indexAdd(array, i);
			if (result > max) {
				max = result;
			}
		}
		return max;
		
    }
	
	//�жϴӵ�index��ʼ�ۼӣ��������ۼ�ʱ�������ֵ��
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
