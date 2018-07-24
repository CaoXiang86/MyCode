import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 * 
 * ˼�룺���û�˷��˼�룬������ö�١�
 * ��һ������������ȣ����������ף��ﵽĿ����ԭ����һ��״̬��Ȼ���ٽ�����һ��������ÿһ�������궼�˻ص���һ���״̬��
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
		//����ָ�Ƿ���������һλ���������һλ�Ǽ�����λ�ã���ʱӦ�жϽ�������Ƿ���ڸ�״̬(���Ƿ�ﵽĿ��)
		if (index == cs.length-1) {
			String string = String.valueOf(cs);//��̬������ֱ�ӽ��ַ�����ת��ΪString
			if (!result.contains(string)) {
				result.add(string);
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
	public void swap(char[] cs, int i, int j) {
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
	
	
	
	
	
}
