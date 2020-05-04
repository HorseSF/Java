/*キーポートから整数を入力させ、
  その数が素数（１またはその数以外で割り切れない数）であるかどうかを判断するコードっを記述してください。*/

package 第６章;

import java.io.*;

public class SampleP5 {
	public static void main(String[] args) throws IOException{
		System.out.println("2以上の整数を入力してください。");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		for(int i=2; i<=num; i++){
			if(i == num){
				System.out.println(num + "は素数です。");
			}
			else if(num % i == 0){
				System.out.println(num + "は素数ではありません。");
				break;
			}
		}
	}
}
