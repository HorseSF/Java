package 第４章if文;

import java.io.*;

public class kasa1 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("降水確率を入力してください。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			System.out.println("降水確率は" + n + "%です。");
			if(n>=50){
				System.out.println("傘を忘れずにね。");
			} else {
				System.out.println("傘は入りません。");
			}
			System.out.println("いってらっしゃい。");
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("数字の型式が正しくありません。");
		}
	}
}
