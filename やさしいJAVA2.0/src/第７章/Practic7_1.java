package 第７章;

import java.io.*;

public class Practic7_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("５人のテストの点数を入力してください。");
		int test[] = new int[5];
		
		for(int i=0;i<5;i++){
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s=0;s<test.length-1;s++){
			for(int t=s+1;t<test.length;t++){
				if(test[t]>test[s]){
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}
			}
		}
		for(int j=0;j<test.length;j++){
			System.out.println((j+1) + "番目の人の点数は" + test[j] + "です。");
		}
	}

}
