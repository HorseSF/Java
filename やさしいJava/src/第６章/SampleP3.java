//タプ（￥t）を使って、次のように九九の表を画面に出力するコードを記述してください。

package 第６章;

public class SampleP3 {
	public static void main(String[] args){
		for(int i=1; i<=9; i++){
			for(int j=1; j<=9; j++){
				System.out.print(i*j+ " ");
			}
			System.out.println();
		}
	}
}
