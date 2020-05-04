package 第７章whileb文とString型;

import java.io.*;

public class Convert1 {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line;
			while((line = reader.readLine()) != null){
				String s = line.replace('。', '.');
				s = s.replace('、', ',');
				System.out.println(s);
			}
		} catch (IOException e){
			System.out.println(e);
		}
	}
}
