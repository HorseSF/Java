package 第９章;

public class Sample_Heikin3_9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ten;
		int sum;
		double heikin;
		
		ten = new int[3];
		ten[0] = 63;
		ten[1] = 90;
		ten[2] = 75;
		sum = 0;
		
		for(int i=0;i<ten.length;i++){
			sum = sum + ten[i];
		}
		heikin = sum/ten.length;
		
		System.out.println(ten[0]);
		System.out.println(ten[1]);
		System.out.println(ten[2]);
		System.out.println(sum);
		System.out.println(heikin);
	}

}
