package 第３章;

import java.io.*;

public class Sample_3_7 {

	public static final int Max_Question = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goodAnswers = 0;
		System.out.println("これから、九九の問題を" + Max_Question + "問出します。");
		
		for(int i=0;i<Max_Question;i++){
			boolean ok = showQuestion(i+1);
			if(ok){
				goodAnswers++;
			}
		}
		double rate = goodAnswers * 100.0 / Max_Question;
		
		System.out.println("--------------");
		System.out.println("問題は" + Max_Question + "問ありました。");
		System.out.println("正しく答えられたのは" + goodAnswers + "問で、");
		System.out.println("間違ってしまったのは" + (Max_Question-goodAnswers) + "問です。");
		System.out.println("正答率は" + rate + "%です。");
		System.out.println();
		System.out.println("お疲れ様です。");
		System.out.println("--------------");		
	}
	
	public static Boolean showQuestion(int questno){
		int x = (int)(Math.random() * 9) + 1;
		int y = (int)(Math.random() * 9) + 1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("[第" + questno + "問]" + x + "X" + y + "=?");
			String line = br.readLine();
			int result = Integer.parseInt(line);
			if(x*y == result){
				System.out.println("はい、正しいです。");
				return true;
			}else{
				System.out.println("残念、間違いです。");
				return false;
			}
		}catch(IOException e){
			System.out.println(e);
		}catch(NumberFormatException e){
			System.out.println("入力が正しくありません。");
		}
		return false;
	}
}
