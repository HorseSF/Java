package 第９章;

public class Practic_ShowMaxData_9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {31,41,59,26,53,58,97,23,84};
		int Max_data = data[0];
		for(int i=0;i<data.length;i++){
			if(data[i] > Max_data){
				Max_data = data[i];
			}
		}
		System.out.println(Max_data);
	}
}

