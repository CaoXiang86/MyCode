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
		//��������ͨ����ָ����λ���㣬������һλ������ʱ��һλΪ1���򴢴�res����res�뵱ǰcurֵ��ˣ�
		//Ϊʲô���԰�ָ����λ���㣬��Ϊָ��������һλ������0�����ʾ�и���λ���������������һλ�����ǵ�ǰֵcur��ƽ��(������)��
		//����10^5 = 10^101 = 10^001*10^100 
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
