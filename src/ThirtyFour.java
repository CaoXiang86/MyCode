import java.util.ArrayList;


/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * 思路：第p,q个丑数，p<q-->p*2<q*2,p*3<q*3,p*5<q*5
 * 
 * 
 * 
 * */
public class ThirtyFour {
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(10));
	}
	
	public static int GetUglyNumber_Solution(int index){
		if (index < 7) {
			return index;//1,2,3,4,5,6都为丑数 而且和index相等
		}
		ArrayList<Integer> result = new ArrayList<>();
		result.add(1);//从1开始乘
		int t2 = 0,t3=0,t5=0;//2,3,5的指针都指向同一个起点
		for(int i = 0;i<index;i++){
			int temp = findMin(result.get(t2)*2,result.get(t3)*3,result.get(t5)*5);//比较起点乘2or3or5后谁小
			result.add(temp);//把最小的加进结果集
			//判断最终加的是哪一个，并且把相对应的指针向后移一位，即第p,q个丑数，p<q-->p*2<q*2,p*3<q*3,p*5<q*5
			if (temp == result.get(t2)*2) {
				t2++;
			}
			if (temp == result.get(t3)*3) {
				t3++;
			}
			if (temp == result.get(t5)*5) {
				t5++;
			}
		}
		for(Integer integer:result){
			System.out.println(integer);
		}
		return result.get(index-1);
	}
	
	private static int findMin(int x,int y,int z) {
		return Math.min(z, Math.min(x, y));
	}
}
