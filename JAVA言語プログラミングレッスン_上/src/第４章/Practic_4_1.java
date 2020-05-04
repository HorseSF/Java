package 第４章;

import java.io.*;

public class Practic_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("現在の時刻を入力してください。");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			int n = Integer.parseInt(str);
			if(n>=24||n<0){
				System.out.println("時刻の範囲を超えています。");
			}else if(n <= 11){
				System.out.println("おはようございます。");
			}else if(n == 12){
				System.out.println("お昼です。");
			}else if(n>=13&&n<=18){
				System.out.println("こんにちは");
			}else if(n>=19&&n<=23){
				System.out.println("こんばんは");
			}
		}catch(IOException e){
		}catch(NumberFormatException e){
			System.out.println("数字を入力してください。");
		}
	}
}
