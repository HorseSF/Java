package 第５章;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("飲み物は何が好きですか？");
			System.out.println("オレンジジュース(orange)");
			System.out.println("コーヒー(coffee)");
			System.out.println("どちらでもない(other)");
			System.out.println("どれかを選んでください。");
			
			String str = br.readLine();
			
			switch (str){
				case "orange":
					System.out.println("オレンジジュースです。");
					break;
				case "coffee":
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
