package 第３章;

import java.io.*;

public class Practice3_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("円周率の値はいくつですか？");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		double num = Double.parseDouble(str);
		
		System.out.println("円周率の値は" + num + "です。");
	}

}
