package 第５章;

import java.io.*;

public class Practic5_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("２つの整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int inum1 = Integer.parseInt(str1);
		int inum2 = Integer.parseInt(str2);
		
		if(inum1 == inum2){
			System.out.println("２つの数は同じ値です。");
		}else if(inum1 > inum2){
			System.out.println(inum2 + "より" + inum1 +"のほうが大きい値です。");
		}else if(inum2 > inum1){
			System.out.println(inum1 + "より" + inum2 +"のほうが大きい値です。");
		}else{
			System.out.println("２つの整数を入力してください。");
		}
	}

}
