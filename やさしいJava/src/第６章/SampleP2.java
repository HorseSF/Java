/*キーボードからテストの点数を入力させ、その合計点を出力するコードを記述してください。
  最後に答えを出力させる場合には、０を入力するものとします。*/

package 第６章;
import java.io.*;

public class SampleP2 {
	public static void main(String[] args) throws IOException{
		System.out.println("テストの点数を入力してください。（０で終了）");
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		int num = 0;
		int sum = 0;
		
		do{
			String str = br.readLine();
			num = Integer.parseInt(str);
			sum += num;
		}while(num != 0);
		System.out.println("テストの合計は" + sum + "点です。");
	}
}
