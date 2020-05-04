package 第１３章;

import java.io.*;

import javax.print.DocFlavor.READER;

public class Sample_DisplayFile_13_2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		for(String filename : args){
			System.out.println("ファイル名" + filename + "====");
			try{
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				while(true){
					String line = reader.readLine();
					if(line == null){
						break;
					}
					System.out.println(line);
				}
				reader.close();
			}catch(FileNotFoundException e){
				System.out.println("ファイルが見つかりません：" + e);
			}catch(IOException e){
				System.out.println("I/Oエラーです:" + e);
			}
		}
	}
}
