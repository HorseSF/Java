package 第９章;

public class Practic_PrintArray_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{3,1,4,1},
				{5,9,2},
				{6,5},
				{3},
		};
		printArray_9_3(arr);
		
	}

	private static void printArray_9_3(int[][] test) {
		// TODO Auto-generated method stub
		System.out.println("{");
		for(int i=0;i<test.length;i++){
			System.out.print("   {");
			for(int j=0;j<test[i].length;j++){
				System.out.print(" " + test[i][j] + ",");
			}
			System.out.println("},");
		}
		System.out.println("}");
	}

}
