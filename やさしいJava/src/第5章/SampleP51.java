package 第5章;
/*
キーボードから１から５までの５段階の成績を入力させ、場合に応じて次のようなメッセージを出力するコードを記述してください。
成績　　　　　メッセージ
1          もっと頑張りましょう。
2　　　　　　もう少し頑張りましょう。
3　　　　　　サラに上を目指しましょう。
4　　　　　　たいへんよくできました。
5　　　　　　たいへん優秀です。
*/
import java.io.*;
public class SampleP51 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("成績を入力してください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		if(num == 1){
			System.out.println("もっと頑張りましょう。");
		}
		else if(num == 2){
			System.out.println("もう少し頑張りましょう。");
		}
		else if(num == 3){
			System.out.println("さらに上を目指しましょう。");
		}
		else if (num == 4){
			System.out.println("たいへんよくできました。");
		}
		else if(num == 5){
			System.out.println("たいへん優秀です。");
		}
		else{
			System.out.println("入力が間違いです。");
		}
	}
}
