
public class Eight {
	//˼·:��n-1����f(n-1)��������n-2����f(n-2)�����������n�׿��Դӵ�n-1����һ����ɣ�Ҳ���Դӵ�n-2����1����ɣ���f(n)=f(n-1)+f(n-2);
	//ʵ���Ͼ���һ�����Ƶ�쳲���������
	//����������Ŀ�����ż�����ȥ��������
	public static void main(String[] args) {
		System.err.println(JumpFloor(3));
	}
	public static int JumpFloor(int target){
		int[] cache = new int[100];
		int result = 0;
		if(target == 1){
			cache[0] = 1;
			return cache[0];
		}else if (target == 2) {
			cache[1] = 2;
			return cache[1];
		}else {
			if (cache[target-1]!=0) {
				result = cache[target-1];
			}else {//�������ڸ���������� ���ҰѼ������Ž�����
				result = JumpFloor(target-1)+JumpFloor(target - 2);
				cache[target-1] = result;
			}				
		}
		return result;
		
	}
	
	
//	public static int JumpFloor(int target) {
//		int result = 0;
//		//��һ�εĴ�������಻����target��
//		for(int i = 0;i <= target ;i++){
//			for(int j = 0; j<= target/2;j++ ){
//				//�����Ĳ�������Ŀ�경��ʱ ����������
//				if(i+2*j==target){
//					result = result + factorial(i+j)/(factorial(i)*factorial(j));
//				}
//			}
//		}
//		return result;
//    }
//	//�õݹ�ķ�����ʵ�ֽ׳�
//	public static int factorial(int n) {
//		if(n==1 || n==0){
//			return 1;
//		}else {
//			return n*factorial(n-1);
//		}
//		
//	}
}
