
public class Nine {
	
	//˼·������ͨ��̨��һ�������ǵݹ�Ĳ���,ͨ��Ϊf(n)=f(n-1)+f(n-2)+...+f(1)+1 = 2*f(n-1)
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
