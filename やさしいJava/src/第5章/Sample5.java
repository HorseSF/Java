package 第5章;

import java.io.*;

public class Sample5 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("整数を入力してください。");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char res = str.charAt(0);//入力した文字列から文字を取り出します。
		
		switch(res){
		case 'a':
			System.out.println("aが入力されました。");
			break;
		case 'b':
			System.out.println("bが入力されました。");
			break;
		default:
			System.out.println("aかbを入力してください。");
			break;
		}
	}
}
