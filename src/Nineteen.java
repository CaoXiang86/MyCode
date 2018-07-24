import java.util.ArrayList;

/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * ˼·�����þ������ת��ʵ�֡�
 * */
public class Nineteen {
	static ArrayList<Integer> arrayList = new ArrayList<>();
	
	
	public ArrayList<Integer> printMatrix(int [][] matrix) {
	    int row = matrix.length;//�������
	    int column = matrix[0].length;//�������
	    if(row != 0){
	    	//��ӡ��һ��
	    	for(int i = 0;i<column;i++){
	    		arrayList.add(matrix[0][i]);
	    	}
	    	//�ݹ�Ĵ�ӡ
	    	int[][] newMatrix = rotateMatrix(matrix);
	    	if (newMatrix!=null) {
	    		printMatrix(newMatrix);
			}
	    }
	    return arrayList;
	}
	//ȥ�������һ�в�����ʱ����ת������ʱ����ת�����ǵ�i�б�Ϊ�¾���ĵ�i�С�
	private static int[][] rotateMatrix(int [][] matrix) {
		int row = matrix.length;//�������
	    int column = matrix[0].length;//�������
	    if (row>1) {
		    int[][] newMatrix = new int[column][row-1];//ȥ��һ������ת�ľ���Ϊ����=old����������=old����-1��
		    //���б�������
		    for(int j = 0; j<column ;j++){
		    	//ȥ����һ��
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
