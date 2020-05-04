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
public class SampleP5 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("成績を入力ください。");
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		switch(num){
		case 1:
			System.out.println("もっと頑張りましょう。");
			break;
		case 2:
			System.out.println("もう少し頑張りましょう。");
			break;
		case 3:
			System.out.println("さらに上に目指しましょう。");
			break;
		case 4:
			System.out.println("たいへんよくできました。");
			break;
		case 5:
			System.out.println("たいへん優秀です。");
			break;
		}
	}
}
