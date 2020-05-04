package 第５章;

import java.io.*;

public class Sample5_5_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("整数を入力しました。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int inum = Integer.parseInt(str);
		
		switch(inum){
		case 1:
			System.out.println("１を入力しました。");
			break;
		case 2:
			System.out.println("２を入力しました。");
			break;
		default:
			System.out.println("１か２を入力してください。");
			break;
		}
	}

}
