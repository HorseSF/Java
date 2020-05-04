package 第５章;

import java.io.*;

public class Sample5_3_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int inum = Integer.parseInt(str);
		
		if(inum == 1){
			System.out.println("１を入力しました。");
		}else{
			System.out.println("１以外を入力しました。");
		}
	}

}
