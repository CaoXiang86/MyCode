import java.util.ArrayList;

public class Seven {
	//斐波那契数列是一个动态规划问题，要求的第n项的值，则需要n-1和n-2项的值，如果直接用递归则算法的复杂度极高趁指数级，
	//所以需要使用缓存，把每计算过的值都记录下来，当下一次需要时直接拿出来使用
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
		//若缓存中存在该项，则直接返回
		if (cache[n-1]!=0) {
			result = cache[n-1];
		}else {//若不存在该项，则计算该项 并且把计算结果放进缓存
			result = Fibonacci(n-1)+Fibonacci(n-2);
			cache[n-1] = result;
		}				
		return result;
    }
}
