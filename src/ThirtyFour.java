import java.util.ArrayList;


/**
 * ��ֻ��������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ����������7�� ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 * ˼·����p,q��������p<q-->p*2<q*2,p*3<q*3,p*5<q*5
 * 
 * 
 * 
 * */
public class ThirtyFour {
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(10));
	}
	
	public static int GetUglyNumber_Solution(int index){
		if (index < 7) {
			return index;//1,2,3,4,5,6��Ϊ���� ���Һ�index���
		}
		ArrayList<Integer> result = new ArrayList<>();
		result.add(1);//��1��ʼ��
		int t2 = 0,t3=0,t5=0;//2,3,5��ָ�붼ָ��ͬһ�����
		for(int i = 0;i<index;i++){
			int temp = findMin(result.get(t2)*2,result.get(t3)*3,result.get(t5)*5);//�Ƚ�����2or3or5��˭С
			result.add(temp);//����С�ļӽ������
			//�ж����ռӵ�����һ�������Ұ����Ӧ��ָ�������һλ������p,q��������p<q-->p*2<q*2,p*3<q*3,p*5<q*5
			if (temp == result.get(t2)*2) {
				t2++;
			}
			if (temp == result.get(t3)*3) {
				t3++;
			}
			if (temp == result.get(t5)*5) {
				t5++;
			}
		}
		for(Integer integer:result){
			System.out.println(integer);
		}
		return result.get(index-1);
	}
	
	private static int findMin(int x,int y,int z) {
		return Math.min(z, Math.min(x, y));
	}
}
