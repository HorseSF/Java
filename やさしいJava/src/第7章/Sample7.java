package 第7章;

public class Sample7 {
	public static void main(String[] args){
		int[] test = {80,60,22,50,75};
		
		for(int i=0; i<5; i++){
			System.out.println((i+1) + "番目の人の点数は" +test[i] + "です。");
		}
		System.out.println("テストの験者は" + test.length + "です。");
	}

}
