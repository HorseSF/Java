package 第９章;

public class Sample_Heikin2_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ten;
		double heikin;
		
		ten = new int[3];
		ten[0] = 63;
		ten[1] = 90;
		ten[2] = 75;
		heikin = (ten[0] + ten[1] + ten[2])/3;
		
		System.out.println(ten[0]);
		System.out.println(ten[1]);
		System.out.println(ten[2]);
		System.out.println(heikin);
	}

}
