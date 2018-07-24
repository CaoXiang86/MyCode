import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * 思路：利用矩阵的旋转来实现。
 * */
public class Nineteen {
	static ArrayList<Integer> arrayList = new ArrayList<>();
	
	
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	    int row = matrix.length;//矩阵的行
	    int column = matrix[0].length;//矩阵的列
	    if(row != 0){
	    	//打印第一行
	    	for(int i = 0;i<column;i++){
	    		arrayList.add(matrix[0][i]);
	    	}
	    	//递归的打印
	    	int[][] newMatrix = rotateMatrix(matrix);
	    	if (newMatrix!=null) {
	    		printMatrix(newMatrix);
			}
	    }
	    return arrayList;
	}
	//去掉矩阵第一行并且逆时针旋转矩阵，逆时针旋转矩阵即是第i列变为新矩阵的第i行。
	private static int[][] rotateMatrix(int [][] matrix) {
		int row = matrix.length;//矩阵的行
	    int column = matrix[0].length;//矩阵的列
	    if (row>1) {
		    int[][] newMatrix = new int[column][row-1];//去第一行且旋转的矩阵为行数=old列数，列数=old行数-1；
		    //以列遍历矩阵
		    for(int j = 0; j<column ;j++){
		    	//去掉第一行
		    	for(int i = 1; i<row;i++){
		    		newMatrix[column-1-j][i-1] = matrix[i][j];
		    	}
		    }
		    return newMatrix;
	    }else{
	    	return null;
	    }
	}
}
