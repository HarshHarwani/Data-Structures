package arrays;

public class RotateMatrix2 {

	public static int[][] rotateMatrix(int[][] m, int dir) {
		int[][] mt = transpose(m);
		if (dir == 0) { //left rotation
			for (int i = 0; i < mt.length/2; i++) {
				for (int j = 0; j < mt[0].length; j++) {
					int temp = mt[i][j];
					mt[i][j] = mt[mt.length - 1 - i][j];
					mt[mt.length - 1 - i][j] = temp;
				}
			}
		}else if(dir==1){ //right rotate
			for (int i = 0; i < mt.length/2; i++) {
				for (int j = 0; j < mt[0].length; j++) {
					int temp = mt[i][j];
					mt[i][j] = mt[i][mt[0].length-1-j];
					mt[i][mt[0].length-1-j] = temp;
				}
			}
		}
		return mt;
	}

	private static int[][] transpose(int[][] m) {
		for(int i=0;i<m.length;i++){
			for(int j=i;j<m[0].length;j++){
				int temp=m[i][j];
				m[i][j]=m[j][i];
				m[j][i]=temp;
			}
		}
		return m;
	}
	
	private static void printMatrix(int[][] mt){
		for(int i=0;i<mt.length;i++){
			for(int j=0;j<mt[0].length;j++){
				System.out.print(mt[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		int[][] m = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
		int[][] result=rotateMatrix(m, 1);
		printMatrix(result);
	}
	
}
