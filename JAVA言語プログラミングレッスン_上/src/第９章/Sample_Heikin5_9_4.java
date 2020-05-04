package 第９章;

public class Sample_Heikin5_9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ten = {63,90,75,45,81};
		int sum = 0;
		for(int i=0;i<ten.length;i++){
			sum = sum + ten[i];
		}
		double heikin = (double)sum/ten.length;
		
		System.out.println(ten[0]);
		System.out.println(ten[1]);
		System.out.println(ten[2]);
		System.out.println(ten[3]);
		System.out.println(ten[4]);
		System.out.println(heikin);
	}

}
