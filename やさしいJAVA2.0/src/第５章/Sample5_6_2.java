package 第５章;

import java.io.*;

public class Sample5_6_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("何番目のコースにしますか");
		System.out.println("整数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int inum = Integer.parseInt(str);
		char ans;
		if(inum == 1){
			ans = 'a';
		}else{
			ans = 'b';
		}
		System.out.println(ans + "コースを選択した。");
		
	}

}
