package 第６章;

import java.io.*;

public class Sample6_5_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("何番目の処理を飛ばしますか？（１−１０）");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int inum = Integer.parseInt(str);
		
		for(int i=1;i<=10;i++){
			if(i == inum){
				continue;
			}
			System.out.println(i + "番目の処理です。");
		}
	}

}
