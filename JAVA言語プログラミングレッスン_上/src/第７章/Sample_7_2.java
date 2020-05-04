package 第７章;

import java.io.*;

public class Sample_7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String str = br.readLine();
			while(str != null){
				System.out.println(str);
				str = br.readLine();
			}
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
