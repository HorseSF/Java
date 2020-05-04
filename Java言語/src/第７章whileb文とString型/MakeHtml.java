package 第７章whileb文とString型;

import java.io.*;

public class MakeHtml {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String line;
			System.out.println("<!DOCTYPE html>");
			System.out.println("<html>");
			System.out.println("<head>");
			System.out.println("<title>My Page</title>");
			System.out.println("</head>");
			System.out.println("<body>");
			while((line = reader.readLine()) != null){
				if(line.startsWith("◾️")){
					System.out.println("<h1>" + line.substring(1) + "</h1>");
				}else if(line.startsWith("⚫️")){
					System.out.println("<h2>" + line.substring(1) + "</h1>");
				}else{
					System.out.println("<p>" + line + "</p>");
				}
			}
			System.out.println("</body>");
			System.out.println("<html>");
		}catch(IOException e){
			System.out.println(e);
		}
	}	
}