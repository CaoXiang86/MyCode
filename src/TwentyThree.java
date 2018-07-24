/**
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ����
 * ����������Yes,�������No���������������������������ֶ�������ͬ��
 * 
 * ˼·���������ĺ���������е����һ��Ԫ����Զ�Ǹ�Ԫ�أ�������BST�����ʣ���������Ԫ��С�ڸ�����������Ԫ�ش��ڸ���
 * ���Կ����ҵ����������к����������У�Ȼ���ٵݹ�İ������������е��µ����н����жϣ�ֱ��ֻ��Ҷ�ڵ����û����/������
 * 
 * ���ԣ�������Ҫ�ݹ�ı���һ�����У�����Ǽ���start������end������Ȼ��ݹ�ĸ���start��end�������Ǹ������б���
 * */
public class TwentyThree {
	
	public static void main(String[] args) {
		
		int[] sequence = {7,4,6,5};
		System.out.println(VerifySquenceOfBST(sequence));
	}
	
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if (sequence.length == 0) {
			return false;
		}else {
			return judge(sequence, 0, sequence.length-1);
		}
	}
	public static boolean judge(int[] sequence,int start,int end) {
		//�ж����е���ʼλ�ã��ͽ���λ�õ����λ��
		if (start >= end) {
			return true;
		}else {
			//����һ���ֲ������������������������������еĽ���λ��
			int i = end-1;
			//���������ж�Ӧ�ñȸ������ԴӺ���ǰ������ֱ�����ֱȸ�С��ʱ�򣬴�ʱ��iΪ�������Ľ���λ�á�
			while(sequence[i] > sequence[end]){
				i--;
			}
			for(int j = i;j>=start;j--){
				if(sequence[j] >= sequence[end]){
					return false;
				}
			}
			//�ݹ���ж�����������������ֻ������������trueʱ�ŷ���true��
			return judge(sequence, start, i) && judge(sequence, i+1, end-1);
		}
	}
}
