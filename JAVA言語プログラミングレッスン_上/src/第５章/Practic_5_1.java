package 第５章;

import java.io.*;

public class Practic_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("０〜６を入力してください。");
			String str = br.readLine();
			int n = Integer.parseInt(str);
			switch (n){
			case 0:
				System.out.println("日曜日");
				break;
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			default:
				System.out.println("以外");
			}
		}catch(IOException e){
		}catch(NumberFormatException e){
			System.out.println("数字を入力してください。");
		}
	}
}
