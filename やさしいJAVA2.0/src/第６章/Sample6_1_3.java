package 第６章;

import java.io.*;

public class Sample6_1_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("いくつ＊を出力します？");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int inum = Integer.parseInt(str);
	
		for(int i=1;i<=inum;i++){
			System.out.print("*");
		}
	}
}
