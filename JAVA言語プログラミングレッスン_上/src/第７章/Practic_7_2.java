package 第７章;

public class Practic_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
//		int j=0;
		while(i<10){
			int j=0;
			while(j<i*i){
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
		
		for(int x=0;x<10;x++){
			for(int y=0;y<x*x;y++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
