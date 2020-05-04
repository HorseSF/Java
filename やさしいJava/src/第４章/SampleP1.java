package 第４章;
/*次の計算の結果を出力するコードを記述してください。
　0-4
 3.14*2
 5/3
 30/7のあまりの数
 （７＋３２）/5
*/
public class SampleP1 {
	public static void main(String[] args)
	{
		int ans1 = 0-4;
		double ans2 = 3.14*2;
		double ans3 = (double)5/3;
		double ans4 = 30%7;
		double ans5 = (7+32)/(double)5;
		System.out.println("0-4は" + ans1 + "です。");
		System.out.println("3.14*2は" + ans2 + "です。");
		System.out.println("5/3は" + ans3 + "です。");
		System.out.println("30/7のあまり数は" + ans4 + "です。");
		System.out.println("(7+32)/5は" + ans5 + "です。");
	}
}
