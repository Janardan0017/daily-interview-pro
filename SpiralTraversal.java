public class SpiralTraversal {

	public static int[] getSpiralList(int[][] matrix){

		int m = matrix.length;
		int n = matrix[0].length;
		int[] result = new int[m*n];
		int p = 0;
		for(int k=0; k < m/2; k++){
			int i = k;
			int j = k;
			while(j < (n-1-k)){
				result[p] = matrix[i][j];
				p++;
				j++;
			}
			while(i < (m-1-k)){
				result[p] = matrix[i][j];
				p++;
				i++;
			}
			while(j > k){
				result[p] = matrix[i][j];
				p++;
				j--;
			}
			while(i > k){
				result[p] = matrix[i][j];
				p++;
				i--;
			}
		}
		return result;
	}

	public static void main(String[] args){

		int[][] matrix1 = {{1, 2, 3, 4, 5}};

		int[][] matrix2 = {{1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10}};

		int[][] matrix3 = {{1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15}};

		int[][] matrix4 = {{1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15},
						  {16, 17, 18, 19, 20}};

		int[][] matrix5 = {{1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15},
						  {16, 17, 18, 19, 20},
						  {21, 22, 23, 24, 25}};

		int[][] matrix6 = {{1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15},
						  {16, 17, 18, 19, 20},
						  {21, 22, 23, 24, 25},
						  {26, 27, 28, 29, 30}};

		int[] result1 = getSpiralList(matrix1);
		System.out.println(java.util.Arrays.toString(result1));

		int[] result2 = getSpiralList(matrix2);
		System.out.println(java.util.Arrays.toString(result2));

		int[] result3 = getSpiralList(matrix3);
		System.out.println(java.util.Arrays.toString(result3));

		int[] result4 = getSpiralList(matrix4);
		System.out.println(java.util.Arrays.toString(result4));

		int[] result5 = getSpiralList(matrix5);
		System.out.println(java.util.Arrays.toString(result5));

		int[] result6 = getSpiralList(matrix6);
		System.out.println(java.util.Arrays.toString(result6));
	}
}