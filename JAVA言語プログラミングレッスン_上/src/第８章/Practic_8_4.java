package 第８章;

public class Practic_8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=-8;i<=8;i++){
			if(i<0){
				printGraph(getPower(i,2),'-');
			}else{
				printGraph(getPower(i,2),'+');
			}
		}
	}

	private static void printGraph(int x, char c) {
		// TODO Auto-generated method stub
		for(int i=0;i<x;i++){
			System.out.print(c);
		}
		System.out.println("");
	}

	private static int getPower(int x, int n) {
		// TODO Auto-generated method stub
		int y = 1;
		for(int i=0;i<n;i++){
			y=y*x;
		}
		return y;
	}
}
