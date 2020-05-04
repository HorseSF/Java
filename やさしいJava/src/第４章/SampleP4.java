package 第４章;
/*キーボートから５科目のテストの点数を入力させ、次のように合計点と平均点を出力するコードを記述してください。
 科目１〜５の点数を入力してください。
 a1
 a2
 a3
 a4
 a5
 5科目の合計点はb1です。
 5科目の平均点はb2です。
 */
import java.io.*;

public class SampleP4 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("科目１〜５の点数を入力してください。");
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		String str3 = br.readLine();
		String str4 = br.readLine();
		String str5 = br.readLine();
		
		int b1 = 0;
		double b2 = 0; 
		b1 += Integer.parseInt(str1);
		b1 += Integer.parseInt(str2);
		b1 += Integer.parseInt(str3);
		b1 += Integer.parseInt(str4);
		b1 += Integer.parseInt(str5);
		b2 = b1/(double)5;
		
		System.out.println("5科目の合計点は" + b1 + "です。");
		System.out.println("5科目の平均点は" + b2 + "です。");
	}

}
