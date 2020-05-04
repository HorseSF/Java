package 第１３章;

import java.io.*;
import java.net.*;

public class Sample_DisplayURL_13_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(String arg : args){
			System.out.println("URL=" + arg);
			try{
				URL url = new URL(arg);
				BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
				while(true){
					String line = reader.readLine();
					if(line == null){
						break;
					}
					System.out.println(line);
				}
				reader.close();
			}catch(MalformedURLException e){
				System.out.println("URL形式が誤っています：" + e);
			}catch(IOException e){
				System.out.println("I/Oエラーです:" + e);
			}
		}
	}

}
