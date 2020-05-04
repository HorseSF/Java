package 第４章;
/*キーボートから三角形の高さと底辺を整数で入力させ、次のように面積を出力するコードを記述してください。
 三角形の高さと底辺を入力してください。
 xxx
 yyy
 三角形の面積はzzzです。
 */

import java.io.*;

public class SampleP3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("三角形の高さと底辺を入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		System.out.println("三角形の面積は" + (a*b)/(double)2 + "です。");		
	}
}
