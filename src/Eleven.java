
public class Eleven {
	public static void main(String[] args) {
		
		System.out.println(NumberOf1(3));
	}
	
	public static int NumberOf1(int n) {
		//integer�ľ�̬����toBinaryString�õ��������ַ���;
		String string = Integer.toBinaryString(n);
		//תΪchar���飬���б�����
		char[] cs = string.toCharArray();
		int result = 0;
		for(char c:cs){
			//ע��������cΪchar���ͣ����Բ���ֱ����c==1��Ҫ��c == '1';
			if (c == '1') {
				result++;
			}
		}
		return result;
    }
}
