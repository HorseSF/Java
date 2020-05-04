package 第７章;

import java.io.*;

public class Sample_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str;
			while((str = br.readLine()) != null){
				System.out.println(str);
			}
		}catch(IOException e){
			
		}
	}

}
