package 第７章;

import java.io.*;

public class Sample_7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=1){
			System.out.println("使用法：java Find1検索文字列＜検索対象ファイル＞");
			System.out.println("例：java Find1 System<Find1.java>");
			System.exit(0);
		}
		String findstring = args[0];
		System.out.println("検索文字列は「" + findstring + "」です。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str;
			int linenum = 1;
			while((str = br.readLine()) != null){
				int n = str.indexOf(findstring);
				if(n >= 0){
					System.out.println(linenum + ":" + str);
				}
				linenum++;
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
