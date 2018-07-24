
public class Eight {
	//思路:第n-1阶有f(n-1)种跳法，n-2阶有f(n-2)种跳发，则第n阶可以从第n-1阶跳一步完成，也可以从第n-2阶跳1步完成，即f(n)=f(n-1)+f(n-2);
	//实际上就是一个类似的斐波那契数列
	//遇到这种题目不用着急下手去做，而是
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
			}else {//若不存在该项，则计算该项 并且把计算结果放进缓存
				result = JumpFloor(target-1)+JumpFloor(target - 2);
				cache[target-1] = result;
			}				
		}
		return result;
		
	}
	
	
//	public static int JumpFloor(int target) {
//		int result = 0;
//		//跳一次的次数，最多不超过target个
//		for(int i = 0;i <= target ;i++){
//			for(int j = 0; j<= target/2;j++ ){
//				//当跳的步数等于目标步数时 满足条件；
//				if(i+2*j==target){
//					result = result + factorial(i+j)/(factorial(i)*factorial(j));
//				}
//			}
//		}
//		return result;
//    }
//	//用递归的方法来实现阶乘
//	public static int factorial(int n) {
//		if(n==1 || n==0){
//			return 1;
//		}else {
//			return n*factorial(n-1);
//		}
//		
//	}
}
