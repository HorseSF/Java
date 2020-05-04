package 第４章if文;

import java.io.*;

public class Greeting {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("現在時刻を入力してください。");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			if(n>24 || n<0){
				System.out.println("時刻の範囲を越えています。");
			} else if(n>=0 && n<=11){
				System.out.println("あはようございます。");
			} else if(n==12){
				System.out.println("お昼です。");
			} else if(n>=13 && n<=18){
				System.out.println("こんにちは");
			} else{
				System.out.println("こんばんは");
			}	
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("数字の形式が正しくありません。");
		}
	}
}
