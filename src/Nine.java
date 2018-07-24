
public class Nine {
	
	//思路：和普通跳台阶一样，都是递归的操作,通项为f(n)=f(n-1)+f(n-2)+...+f(1)+1 = 2*f(n-1)
	public int JumpFloorII(int target) {
        if(target == 1){
        	return 1;
        }else if (target == 2) {
			return 2;
		}else {
			return 2*JumpFloorII(target-1);
		}
    }
	
}
