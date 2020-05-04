package 第５章;

import java.io.*;

public class Sample5_6_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("あなたは男性ですか？");
		System.out.println("YまたはNを入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char res = str.charAt(0);
		
		if(res == 'y' || res == 'Y'){
			System.out.println("あなたは男性です。");
		}else if(res == 'n' || res == 'N'){
			System.out.println("あなたは女性です。");
		}else{
			System.out.println("YまたはNを入力してください。");
		}
	}

}
