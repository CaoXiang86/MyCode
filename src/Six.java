
public class Six {
	//˼·����Ϊԭʼ�����Ƿǵݼ��ģ�����ԭʼ���еĵ�һ������ԶΪ��С��ֵ������ת������������ǰһ��ֵ���ں���һ��ֵʱ����������Ԫ��ΪԪ������Сֵ
	public int minNumberInRotateArray(int [] array){
		//��ʱ��������ֵ��Ϊͬһ��ֵ������ֱ�ӷ�������һ��ֵ���ɣ�
		int result = 0;
		if(array[0] == array[array.length-1]){
			result = array[0];
		}else{
			//�������飬�����ֵ�ǰֵ���ں����ֵʱ�򷵻ء�
			for(int i = 0; i <array.length-2;i++){
				if(array[i]>array[i+1]){
					result = array[i+1];
					break;
				}
			}
			//������û����ת����result == 0
			if(result == 0){
				result = array[0];
			}
		}
		return result;
	}
}
