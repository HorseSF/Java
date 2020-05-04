package 第３章;
/*あなたは何歳ですか？
 　23
  あなたは２３歳です。
*/
import java.io.*;

public class SampleP3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("あなたは何歳ですか？");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("あなたは" + num + "歳です。");
	}
}
