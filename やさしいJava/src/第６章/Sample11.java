//continue文の仕組みを知る

package 第６章;

import java.io.*;

public class Sample11 {
	public static void main(String[] args) throws IOException{
		System.out.println("何番目の処理を飛ばしますか？（１〜１０）");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		for(int i=1; i<=10; i++){
			if(i == res)
				continue;
			System.out.println(i + "番目の処理です。");
		}
	}
}
