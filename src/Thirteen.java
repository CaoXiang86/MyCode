import java.util.ArrayList;

/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣�
 * ���е�ż��λ��λ������ĺ�벿�֣�����֤������������ż����ż��֮������λ�ò��䡣
 */
public class Thirteen {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		reOrderArray(a);
		for(int b:a){
			System.out.println(b);
		}
	}
	
	public static void reOrderArray(int [] array) {
        //�Ӻ�����ǰ��ʼѰ��ż��
		for(int i = array.length -2;i>=0;i--){
        	if(array[i]%2 == 0){
        		//�ӵ�ǰż����ʼ�����Ѱ�������������������򽻻�������λ��
        		for(int j = i+1;j<array.length;j++){
        			if (array[j]%2 == 1) {
						swap(array, j, j-1);
					}
        		}
        	}
        }
     }
	public static void swap(int[] array,int a,int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
}
