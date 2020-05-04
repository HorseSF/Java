package 第５章;

import java.io.*;

public class Practic5_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("０から１０までの整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int inum = Integer.parseInt(str);
		if(inum >= 0 && inum <=10){
			System.out.println("正解です。");
		}else{
			System.out.println("０から１０までの整数を入力してください。");
		}
	}

}
