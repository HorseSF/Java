package 第７章;

public class Sample7_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[];
		test = new int[5];
		test[0] = 80;
		test[1] = 70;
		test[2] = 60;
		test[3] = 50;
		test[4] = 40;
		
		for(int i=0;i<=4;i++){
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
	}

}
