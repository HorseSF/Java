package 第7章;

import java.io.*;

public class Sample2 {
	public static void main(String[] args) throws IOException{
		System.out.println("テストの受験者数を入力してください。");
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		int[] test;
		test = new int[num];
		
		System.out.println("人数分の点数を入力してください。");
		
		for(int i=0; i<num; i++){
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i=0; i<num; i++){
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
	}
}