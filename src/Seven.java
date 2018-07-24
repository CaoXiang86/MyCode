import java.util.ArrayList;

public class Seven {
	//쳲�����������һ����̬�滮���⣬Ҫ��ĵ�n���ֵ������Ҫn-1��n-2���ֵ�����ֱ���õݹ����㷨�ĸ��Ӷȼ��߳�ָ������
	//������Ҫʹ�û��棬��ÿ�������ֵ����¼����������һ����Ҫʱֱ���ó���ʹ��
	private static int[] cache = new int[300];
	static{
		cache[0] = 1;//n=1
		cache[1] = 1;//n=2
	}
	
	public static void main(String[] args) {
		System.err.println(Fibonacci(10));
		for(int i = 0; i<10;i++){
			System.out.println(cache[i]);
		}
	}
	
	public static int Fibonacci(int n) {
		int result = 0;
		//�������д��ڸ����ֱ�ӷ���
		if (cache[n-1]!=0) {
			result = cache[n-1];
		}else {//�������ڸ���������� ���ҰѼ������Ž�����
			result = Fibonacci(n-1)+Fibonacci(n-2);
			cache[n-1] = result;
		}				
		return result;
    }
}
