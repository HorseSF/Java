package 第５章;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("飲み物は何が好きですか？");
			System.out.println("aオレンジジュース");
			System.out.println("bコーヒー");
			System.out.println("cどちらでもない");
			System.out.println("a、b、cのどれかを選んでください。");
			
			String str = br.readLine();
			char c = str.charAt(0);
			
			switch (c){
				case 'a':
					System.out.println("オレンジジュースです。");
					break;
				case 'b':
					System.out.println("コーヒーです。");
					break;
				default:
					System.out.println("どちらでもない。");
					break;
			}
		}catch(IOException e){
		}catch(NumberFormatException e){
			System.out.println("数字を入力してください。");
		}
	}

}