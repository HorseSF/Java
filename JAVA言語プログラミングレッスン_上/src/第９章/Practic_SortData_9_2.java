package 第９章;

public class Practic_SortData_9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {31,41,59,26,53,58,97,93,23,84};
		System.out.println("並べ替える前");
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
		
		System.out.println("並べ替える後");
		for(int i=0;i<data.length-1;i++){
			for(int j=i+1;j<data.length;j++){
				if(data[i] > data[j]){
					int a = data[i];
					data[i] = data[j];
					data[j] = a;
				}
			}
		}
		
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
	}
}
