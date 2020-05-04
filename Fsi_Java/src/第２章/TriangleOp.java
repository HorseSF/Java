package 第２章;

public class TriangleOp {
	public static void main(String[] args){
		int i;int j;int z;
		
		for(i=1;i<=6;i++){
			for(z=6;z>i;z--){
				System.out.print(" ");
				}
			for(j=1;j<=2*i-1;j++){
				System.out.print("*");
				}
			System.out.println();
		}
	}
}
