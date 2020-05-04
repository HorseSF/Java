package 第１４章;

import java.io.*;

public class Sample14_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.doc")));
			pw.println("Hello");
			pw.println("GoodBye!");
			
			System.out.println("ファイルに書き込みました。");
			
			pw.close();
		}
		catch(IOException e){
			System.out.println("入出力エラーです。");
		}
	}

}
