package 第４章;

import java.io.*;

public class Sample_4_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("降雨確率を入力してください。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = br.readLine();
			int n = Integer.parseInt(str);
			if(n>=50){
				System.out.println("傘を忘れずにね。");
			}else{
				System.out.println("傘はいりません。");
			}System.out.println("行ってらっしゃい。");
		}catch(NumberFormatException e){
			System.out.println("数字の形式が正しくありません。");
		}
	}

}
