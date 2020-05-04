package 第９章;

public class Sample_Heikin6_9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tens = {
				{63,90,75,45,81},
				{85,100,95,80,90},
				{100,100,100,100,100},
		};
		for(int i=0;i<tens.length;i++){
			int sum = 0;
			for(int j=0;j<tens[i].length;j++){
				System.out.print(" " + tens[i][j]);
				sum = sum + tens[i][j];
			} 
			System.out.println(" |" + (double)sum/tens[i].length);
		}
	}
}
