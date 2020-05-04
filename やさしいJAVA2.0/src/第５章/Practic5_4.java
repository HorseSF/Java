package 第５章;

import java.io.*;

public class Practic5_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("成績を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int inum = Integer.parseInt(str);
		switch(inum){
		case 1:
			System.out.println("もっと頑張りましょう。");
			break;
		case 2:
			System.out.println("もう少し頑張りましょう。");
			break;
		case 3:
			System.out.println("さらに上を目指しましょう");
			break;
		case 4:
			System.out.println("大変よくできました。");
			break;
		case 5:
			System.out.println("大変優秀です。");
			break;
		}
	}

}
