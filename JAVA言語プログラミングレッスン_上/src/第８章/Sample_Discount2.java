package 第８章;

public class Sample_Discount2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,q;
		p = 1000;
		q = halve(p);
		System.out.println("元の値段が" + p + "円なら、半額だと" + q + "円になります。");
	}

	private static int halve(int n) {
		// TODO Auto-generated method stub
		return n/2;
	}

}
