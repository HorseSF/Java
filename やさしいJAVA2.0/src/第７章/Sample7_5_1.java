package 第７章;

public class Sample7_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1[] = new int[3];
		
		System.out.println("test1を宣言しました。");
		System.out.println("配列要素を確保しました。");
		
		test1[0] = 80;
		test1[1] = 70;
		test1[2] = 60;
		
		int test2[];
		System.out.println("test2を宣言しました。");
		
		test2 = test1;
		System.out.println("test2にtest1を代入しました。");
		
		for(int i=0;i<3;i++){
			System.out.println((i+1) + "番目の人の点数は" + test1[i] + "です。");
		}
		for(int i=0;i<3;i++){
			System.out.println((i+1) + "番目の人の点数は" + test2[i] + "です。");
		}
		
	}

}
