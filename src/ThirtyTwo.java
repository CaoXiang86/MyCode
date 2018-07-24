import java.util.ArrayList;
import java.util.List;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 * ˼·���õ����������������ϣ�Ȼ���ٱȽϴ�С
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
	//���û�˷���õ����������������ϡ�
	private static void helper(int[] cs,int index,List<Long> result) {
		//����ָ�Ƿ���������һλ���������һλ�Ǽ�����λ�ã���ʱӦ�жϽ�������Ƿ���ڸ�״̬(���Ƿ�ﵽĿ��)
		if (index == cs.length-1) {
			StringBuffer stringBuffer = new StringBuffer();
			for(int i = 0 ; i < cs.length;i++){
				stringBuffer.append(cs[i]);
			}
			Long integer = Long.valueOf(stringBuffer.toString());
			if (!result.contains(integer)) {
				result.add(integer);
			}
		}else{//��û�дﵽ�����
			//��ָ��λ�ÿ�ʼ����
			for(int i = index;i<cs.length;i++){
				swap(cs,i,index);//����i��index��λ��
				helper(cs, index+1, result);//���ǰ��
				swap(cs,i,index);//���ݣ��˻ص���һ���״̬
			}
			
		}
	}
	
}
