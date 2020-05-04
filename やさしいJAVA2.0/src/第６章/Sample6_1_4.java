package 第６章;

import java.io.*;

public class Sample6_1_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("いくつの合計を求めます。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int inum = Integer.parseInt(str);
		
		int sum = 0;
		for(int i=1;i<=inum;i++){
			sum += i;
		}
			System.out.println("１から" + inum + "までの合計は" + sum + "です。");
	}
}
