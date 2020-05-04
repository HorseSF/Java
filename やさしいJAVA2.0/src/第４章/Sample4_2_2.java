package 第４章;

public class Sample4_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 0;
		int c = 0;
		
		c = a++;
		System.out.println("代入後にインクリメントしたタメでcの値は" + c + "です。");
		
		c = ++b;
		System.out.println("代入前にインクリメントしたタメでcの値は" + c + "です。");
	}

}
