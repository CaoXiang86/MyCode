
public class Eleven {
	public static void main(String[] args) {
		
		System.out.println(NumberOf1(3));
	}
	
	public static int NumberOf1(int n) {
		//integer的静态方法toBinaryString得到二进制字符串;
		String string = Integer.toBinaryString(n);
		//转为char数组，进行遍历。
		char[] cs = string.toCharArray();
		int result = 0;
		for(char c:cs){
			//注意在这里c为char类型，所以不能直接用c==1而要用c == '1';
			if (c == '1') {
				result++;
			}
		}
		return result;
    }
}
