package 第６章;

import java.io.*;

public class Sample6_5_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("成績を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int inum = Integer.parseInt(str);
		
		switch(inum){
			case 1:
			case 2:
				System.out.println("もう少し頑張りましょう。");
				break;
			case 3:
			case 4:
				System.out.println("この調子で頑張りましょう");
				break;
			case 5:
				System.out.println("大変優秀です。");
				break;
			default:
				System.out.println("１〜５までの成績を入力してください。");
				break;
		}
	}

}
