package 第５章;

import java.io.*;

public class Sample_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("飲み物は何が好きですか？");
			System.out.println("１オレンジジュース");
			System.out.println("２コーヒー");
			System.out.println("３どちらでもない");
			System.out.println("１、２、３のどれかを選んでください。");
			
			String str = br.readLine();
			int n = Integer.parseInt(str);
			
			switch (n){
				case 1:
					System.out.println("オレンジジュースです。");
					break;
				case 2:
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
