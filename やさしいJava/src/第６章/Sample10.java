//switch文の中でbreak文を使う

package 第６章;

import java.io.*;

public class Sample10 {
	public static void main(String[] args) throws IOException{
		System.out.println("成績を入力してくだいさい。（１〜５）");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = Integer.parseInt(str);
		switch(res){
			case 1:
			case 2:
				System.out.println("もう少し頑張りましょう。");
				break;
			case 3:
			case 4:
				System.out.println("この調子で頑張りましょう。");
				break;
			case 5:
				System.out.println("たいへん優秀です。");
				break;
			default:
				System.out.println("1~5まで成績を入力してください。");
				break;
		}
	}
}
