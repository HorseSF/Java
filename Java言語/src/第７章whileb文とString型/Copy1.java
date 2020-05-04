package 第７章whileb文とString型;
//输入文字，回车复制

import java.io.*;

public class Copy1 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = reader.readLine();
			while(line != null){
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
