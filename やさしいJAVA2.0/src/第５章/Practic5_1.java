package 第５章;

import java.io.*;

public class Practic5_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();	
		
		int inum = Integer.parseInt(str);
		if(inum%2 == 0){
			System.out.println(inum + "は偶数です。");
		}else if (inum%2 == 1){
			System.out.println(inum + "は奇数です。");
		}else{
			System.out.println("整数を入力してください。");
		}
	}

}
