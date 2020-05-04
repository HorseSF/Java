//1~10まで偶数を出力します。

package 第６章;

public class SampleP1 
{
	public static void main(String[] args)
	{
		System.out .println("１〜１０までの偶数を出力します。");
		for(int i=1; i<=10; i++){
			if((i % 2) == 0)
				System.out.println(i);
		}
	}
}
