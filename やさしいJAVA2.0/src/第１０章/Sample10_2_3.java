package 第１０章;

import java.io.*;

public class Sample10_2_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("文字列を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("検索文字を入力してください。");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num != -1){
			System.out.println(str1 + "の" + (num+1) + "番目に「" + ch + "」が見つかりました。");
		}else{
			System.out.println(str1 + "に「" + ch + "」はありません。");
		}
	}

}
