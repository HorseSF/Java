package 第３章;
/*
 円周率の値はいくつですか？
 ３．１４
 円周率の値は３．１４です。
 */

import java.io.*;

public class SampleP4 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("円周率の値はいくつですか？");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double num = Double.parseDouble(str);
		System.out.println("円周率の値は" + num + "です。");
	}

}
