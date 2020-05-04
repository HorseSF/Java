package 第７章;

import java.io.*;

public class Practic_7_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line;
			System.out.println("<!DOCTYPE html>");
			System.out.println("<html>");
			System.out.println("<head>");
			System.out.println("title>My Page</title>");
			System.out.println("</head>");
			System.out.println("<body>");
			while((line = br.readLine()) != null){
				if(line.startsWith("○")){
					System.out.println("<h1>" + line.substring(1) + "</h1>");
				}else if(line.startsWith("●")){
					System.out.println("<h2>" + line.substring(1) + "</h2>");
				}else{
					System.out.println("<p>" + line + "</p>");
				}
			}
			System.out.println("</body>");
			System.out.println("</html>");
		}catch(IOException e){
			System.out.println(e);
		}
	}
}

/*入力ファイル
●私のホームページへようこそ
○こんにちは
こんにちは！私のホームページへようこそ
○自己紹介
私は。。。  
 * */
