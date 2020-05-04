package 第６章;

public class Sample6_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(b1 == true){
					System.out.print("*");
					b1 = false;
				}else{
					System.out.print("-");
					b1 = true;
				}
			}
			System.out.println("");
		}
	}

}
