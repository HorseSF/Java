package 第5章;
/*
キーポードから整数値を入力させ、場合に応じて次のようなメッセージを出力するコードを記述してください。
値が0~10の場合ーーーー＞「正解です。」
それ以外の場合ーーーー＞「間違いです。」
*/
import java.io.*;
public class SampleP4 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("0から10までの整数を入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		if(num <= 10 && num >= 0){
			System.out.println("正解です。");	
		}
		else{
			System.out.println("間違いです。");
		}
	}
}
