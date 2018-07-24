
public class Ten {
	
	public static void main(String[] args) {
		Ten ten = new Ten();
		
		System.out.println(ten.RectCover(10));
	}
	
	//思路：想要覆盖2*n的大矩形，那么实际上就是把n分为1和2相加有多少种可能，这和跳台阶的思路一样，使用递归f(n) = f(n-1)+f(n-2),斐波那契数列
	public int RectCover(int target) {
		if(target <= 0){
			return 0;
		}else if(target==1){
            return 1;
        }
        else if(target == 2){
			return 2;
		}else{
			return RectCover(target-1)+RectCover(target-2);
		}
    }
}
