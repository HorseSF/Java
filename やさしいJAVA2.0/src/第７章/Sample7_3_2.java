package 第７章;

import java.io.*;

public class Sample7_3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("テストの受験者数を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int inum = Integer.parseInt(str);
		
		int test[] = new int[inum];
		
		System.out.println("人数分の点数を入力してください。");
		
		for(int i=0;i<inum;i++){
			str = br.readLine();
			int tmp = Integer.parseInt(str);
			test[i] = tmp;
		}
		
		for(int i=0;i<inum;i++){
			System.out.println((i+1) + "番目の人の点数は" + test[i] + "です。");
		}
	}

}
