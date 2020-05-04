package 第８章;

public class Practic_8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int n=-8;n<=8;n++){
			printGraph(n*n);
		}
	}

	private static void printGraph(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			System.out.print("*");
		}
		System.out.println("");
	}
}
