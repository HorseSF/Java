//次のように画面に出力するコードを記述してください。

package 第６章;

public class SampleP4 {
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}