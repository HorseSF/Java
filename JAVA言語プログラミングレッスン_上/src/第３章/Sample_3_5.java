package 第３章;

import java.io.*;

public class Sample_3_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("あなたの名前を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String name = br.readLine();
			System.out.println(name + "さん、こんにちは。");
		
			System.out.println("年齢を入力してください。");
			String years = br.readLine();
			int age = Integer.parseInt(years);
			System.out.println("今" + age + "歳とすると、１０年後は" + (age + 10) + "歳ですね。");
		}catch(NumberFormatException e){
			System.out.println("年齢が正しくありません。");
		}
	}

}
