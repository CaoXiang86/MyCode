
public class Ten {
	
	public static void main(String[] args) {
		Ten ten = new Ten();
		
		System.out.println(ten.RectCover(10));
	}
	
	//˼·����Ҫ����2*n�Ĵ���Σ���ôʵ���Ͼ��ǰ�n��Ϊ1��2����ж����ֿ��ܣ������̨�׵�˼·һ����ʹ�õݹ�f(n) = f(n-1)+f(n-2),쳲���������
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
