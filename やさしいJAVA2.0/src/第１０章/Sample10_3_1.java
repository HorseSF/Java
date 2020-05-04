package 第１０章;

import java.io.*;

public class Sample10_3_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("整数を２つ入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1,num2);
		System.out.println(num1 + "と" + num2 + "のうち大きい方は" + ans + "です。");
	}

}

/*
 * static double abs(double a)　→　double型の引数の絶対値を返す
 * static int abs(int a)　→　int型の引数の絶対値を返す
 * static double ceil(double a)　→　double型の引数以上でもっとも小さい整数値をdouble型で返す
 * static double cos(double a)　→　引数の角度のコサイン値を返す
 * static double floor(double a)　→　double型の引数以下でもっとも大きい整数値をdouble型で返す
 * static double max(double a,double b)　→　２つのdouble型の引数のうち大きい値を返す
 * static double max(int a,int b)　→　２つのint型の引数のうち大きい値を返す
 * static double min(double a,double b)　→　２つのdouble型の引数のうち小さい値を返す
 * static double min(int a,int b)　→　２つのint型の引数のうち小さい値を返す
 * static double pow(double a,double b)　→　１番目の引数を２番目の引数で累乗した結果を返す
 * static double random()　→　0.0~1.0の乱数を返す
 * static int rint(double a)　→　double型の引数にもっとも近い整数値を返す
 * static double sin(double a)　→　引数の角度のサイン値を返す
 * static double sqrt(double a)　→　double型の引数の平方根を返す
 * static double tan(double a)　→　引数の角度のタンジェント値を返す
 */
