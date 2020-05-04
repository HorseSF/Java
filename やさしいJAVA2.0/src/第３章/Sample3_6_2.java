package 第３章;

import java.io.*;

public class Sample3_6_2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		//文字列を変換してint型の変数に読み込みます。
		int num = Integer.parseInt(str);
		System.out.println(num + "が入力されました。");
	}

}
