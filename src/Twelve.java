import javax.management.RuntimeErrorException;

public class Twelve {
	
	public static void main(String[] args) {
		System.out.println(4&1);
	}
	
	public double Power(double base, int exponent) {
       
		return Math.pow(base, exponent);
	}
	
	public double Power1(double base, int n) {
		int res = 1;
		double cur = base;
		int component;
		if(n<0){
			component = -n;
		}else if(n==0) {
			return 1;
		}else {
			component = n;
		}
		//在这里是通过将指数做位运算，向右移一位，若此时第一位为1，则储存res，将res与当前cur值相乘，
		//为什么可以把指数做位运算，因为指数向右移一位不等于0，则表示有更高位，而二进制向左进一位，就是当前值cur的平方(二进制)。
		//例如10^5 = 10^101 = 10^001*10^100 
		while(component!=0){
			if((component&1)==1){
				res*=cur;
			}
			cur*=cur;
			component>>=1;
		}
		return n>0?res:(1/res);
	}
	
}
