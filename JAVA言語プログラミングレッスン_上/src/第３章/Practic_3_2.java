package 第３章;

import java.io.*;

public class Practic_3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("名前を入力してください。");
			String name1 = br.readLine();
		
			System.out.println(name1 + "さん年齢を入力してください。");
			String years1 = br.readLine();
			int age1 = Integer.parseInt(years1);
			
			System.out.println("名前を入力してください。");
			String name2= br.readLine();
		
			System.out.println(name2 + "さん年齢を入力してください。");
			String years2 = br.readLine();
			int age2 = Integer.parseInt(years2);
			
			System.out.printf("平均年齢は%dです。%n",(age1+age2)/2);
		}catch(NumberFormatException e){
			System.out.println("年齢が間違いました。");
		}
	}
}
