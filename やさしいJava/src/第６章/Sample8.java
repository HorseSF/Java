//if分などと組み合わせる
package 第６章;

public class Sample8 {
	public static void main(String[] args){
		boolean b1 = false;
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				if(b1 == false){
					System.out.print("*");
					b1 = true;
				}
				else{
					System.out.print("-");
					b1 = false;
				}
			}
			System.out.println();
			//System.out.print("¥n");
		}
	}
}
