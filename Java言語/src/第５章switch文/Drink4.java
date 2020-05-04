package 第５章switch文;

import java.io.*;

public class Drink4 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("飲み物は何が好きですか？");
			System.out.println("オレンジジュース（orange）");
			System.out.println("コーヒー（coffee）");
			System.out.println("どちらでもない（other）");
			System.out.println("orange,coffee,otherのどれかを選んでください。");
			String line = reader.readLine();
			switch(line){
			case "orange":
				System.out.println("オレンジジュースです。");
				break;
			case"coffee":
				System.out.println("コーヒーです。");
				break;
			default:
				System.out.println("どちらでもありません。");
				break;
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
