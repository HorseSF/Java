package 第８章;

public class Sample_Prower1_7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPrower(8,2));
	}

	private static int getPrower(int x, int n) {
		// TODO Auto-generated method stub
		int y = 1;
		for(int i=0;i<n;i++){
			y = y*x;
		}
		return y;
	}
}
