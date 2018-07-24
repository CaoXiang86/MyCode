/**
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次,
 * 但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数。
 * 
 * 
 * 
 * */
public class ThirtyOne {
	
	public static void main(String[] args) {
		 System.out.println(NumberOf1Between1AndN_Solution(12));
	}
	
	public static int NumberOf1Between1AndN_Solution(int n) {
	    //首先判断n的位数
		int i = 1;
		while(n / 10 != 0){
			i++;
			n /= 10;
		}
		//得到去掉最高位后面的部分
		if (i == 1) {
			return 1;
		}else {
			int temp = 10;
			//现在得到的temp 为 需要判断n的第x位为多少；
			while(i > 1){
				temp *= 10;
				i--;
			}
			int j = n / temp;//n的最高位的数字；
			int before = j * temp;//例如4821049得到 4000000
			
			
		}
    }
	
	//计算y位整数n的前x位1出现的个数。
	public int method(int n,int x) {
		if (x == 1) {
			return 1;
		}else {
			int result = 10;
			//现在得到的result 为 需要判断n的第x位为多少；
			while(x > 1){
				result *= 10;
				x--;
			}
			int temp = n % result;//得到n的第x位的数字；
			if (temp == 0) {
				return method(n, x-1);//直接跳过当前位，
			}else if (temp == 1) {
				return n - n/result * result +method(n, x-1);
			}else if (temp > 1 ){
				
			}
		}
}
