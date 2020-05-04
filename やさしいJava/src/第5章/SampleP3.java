package 第5章;
/*
キーボードから２つの整数値を入力させ、場合に応じて次のようなメッセージを出力するコードを記述してください。
値が同じ場合ーーーー＞「２つの数は同じ値です。」
それ以外の場合ーーーー＞「xxxよりyyyの方が大きい値です。」
*/
import java.io.*;
public class SampleP3 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("２つの整数を入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		if(num1 > num2){
			System.out.println(num2 + "より" + num1 + "方が大きい値です。");
		}
		else if(num1 == num2){
			System.out.println("２つの値は同じです。");
		}
		else{
			System.out.println(num1 + "より" + num2 + "方が大きい値です。");
		}
	}
}
