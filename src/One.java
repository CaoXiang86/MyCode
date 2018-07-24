
public class One {
	
	public static void main(String[] args) {
		int[][] a = {{1,2},{3,4},{5,6}};
		System.out.println(find(2, a));
	}
	
	
	public static boolean find(int target,int[][] a) {
		int row = a.length;//二维数组a的行数
		int column = a[1].length;//二维数组a的列数
		if(target > a[row-1][column-1] || target < a[0][0]){
			return false;
		}else {
			for(int i = row-1; i >=0;i--){
				if(target >= a[i][0]){
					for(int j = 0; j<column ;j++){
						if(target == a[i][j]){
							return true;
						}
					}
				}
			}
			return false;
		}
		
	}
}
