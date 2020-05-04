package 第４章;
/*キーボートから正方形の一辺の長さを整数で入力させ、次のように面積を出力するコードを記述してください。
　正方形の辺の長さを入力してください。
　xxx
 正方形の面積はyyyです。
 */
import java.io.*;

public class SampleP2 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("正方形の辺の長さを入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a = Integer.parseInt(str);
		int b = a*a;
		System.out.println("正方形の面積は" + b + "です。");
	}

}
