/**
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,
 * ���Ƕ��ں�����������û���ˡ�ACMerϣ�����ǰ����,������������ձ黯,
 * ���Ժܿ���������Ǹ�����������1���ֵĴ�����
 * 
 * 
 * 
 * */
public class ThirtyOne {
	
	public static void main(String[] args) {
		 System.out.println(NumberOf1Between1AndN_Solution(12));
	}
	
	public static int NumberOf1Between1AndN_Solution(int n) {
	    //�����ж�n��λ��
		int i = 1;
		while(n / 10 != 0){
			i++;
			n /= 10;
		}
		//�õ�ȥ�����λ����Ĳ���
		if (i == 1) {
			return 1;
		}else {
			int temp = 10;
			//���ڵõ���temp Ϊ ��Ҫ�ж�n�ĵ�xλΪ���٣�
			while(i > 1){
				temp *= 10;
				i--;
			}
			int j = n / temp;//n�����λ�����֣�
			int before = j * temp;//����4821049�õ� 4000000
			
			
		}
    }
	
	//����yλ����n��ǰxλ1���ֵĸ�����
	public int method(int n,int x) {
		if (x == 1) {
			return 1;
		}else {
			int result = 10;
			//���ڵõ���result Ϊ ��Ҫ�ж�n�ĵ�xλΪ���٣�
			while(x > 1){
				result *= 10;
				x--;
			}
			int temp = n % result;//�õ�n�ĵ�xλ�����֣�
			if (temp == 0) {
				return method(n, x-1);//ֱ��������ǰλ��
			}else if (temp == 1) {
				return n - n/result * result +method(n, x-1);
			}else if (temp > 1 ){
				
			}
		}
}
