package 第６章;

import java.io.*;

public class Practic6_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("２以上の整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int inum = Integer.parseInt(str);
		
		for (int i=2;i<=inum;i++){
			if(i == inum){
				System.out.println(inum + "は素数です。");
			}
			else if(inum%i == 0){
				System.out.println(inum + "は素数ではありません。");
				break;
			}
		}
	}

}
