import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

/**
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 * 
 * 
 * */
public class TwentyNine {
	public static void main(String[] args) {
		int[] input = {4,5,1,6,2,7,3,8};
		TwentyNine twentyNine = new TwentyNine();
		twentyNine.quickSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
			
		}
		//System.out.println(twentyNine.GetLeastNumbers_Solution(input, 4));
	}
	
	public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
		ArrayList<Integer> list = new ArrayList<>();
        
		if(k <= input.length) {
        	//�ȶ������������Ȼ����ȡǰk��Ԫ�ؼ��ɣ�������ʹ�ÿ��������㷨
        	quickSort(input);
        	for(int i = 0; i<k;i++){
        		list.add(input[i]);
        	}
		}
		return list;
    }
	
	private void quickSort(int[] input){
		quickSort(input, 0, input.length-1);
	}
	
	private void quickSort(int[] input , int start, int end) {
		if (start + 10 <= end) {
			int pilot = median3(input, start, end);
			//Ϊʲô����ȡ������Ϊ��һ��Ԫ�ؿ϶�С��pilot�����һ��Ԫ�ؿ϶�����pilot��������whileѭ����ֱ����++i��--j
			int i = start; int j = end-1;
			while(true){
				while(input[++i] < pilot &&input[--j] >pilot ) {
				}
				
				if (i<j) {
					swap(input, i, j);
				}else{
					break;
				}
			}
			System.out.println(input[end-1]);
			//��i��Ԫ�ص�λ��ȷ����iǰ��Ķ���iС��i����Ķ���i�����Եݹ����ǰ��ĺͺ����
			swap(input, i, end-1);
			
			quickSort(input,start,i-1);
			quickSort(input, i+1, end);
		}else {
			insertSort(input);
		}
	}
	private void insertSort(int[] input) {
		
		for(int i = 1 ; i<input.length ; i++){
			for(int j = i; j>0;j--){
				if (input[j] < input [j-1]) {
					swap(input, j, j-1);
				}
			}
		}
	}
	
	
	private int median3(int[] input,int start,int end){
		int centre = (start+end)/2;
		if (input[start] > input[centre]) {
			swap(input, start, centre);
		}
		if (input[centre] > input[end]) {
			swap(input, centre, end);
		}
		if (input[start] > input[centre] ) {
			swap(input, start, centre);
		}
		swap(input, centre, end-1);
		
		return input[end-1];
		
	}
	private void swap(int[] input,int a,int b){
		int temp = input[a];
		input[a] = input[b];
		input[b] = temp;
	}
	
}
