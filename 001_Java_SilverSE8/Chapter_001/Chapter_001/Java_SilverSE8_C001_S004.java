package Chapter_001;

/**
 * 
 * @author xiaofeima
 *
 */

public class Java_SilverSE8_C001_S004 {
	public static void main(String[] args){
		System.out.println(255);		//10進数
		System.out.println(0b11111111);	//2進数
		System.out.println(0377);		//8進数
		System.out.println(0xff);		//16進数
		System.out.println(12.33);		//10進数
		System.out.println(3e4);		//指数
		System.out.println('A');		//１文字
		System.out.println('\u3012');	//unicode
		System.out.println("hello");	//文字列
		System.out.println(true);		//論理値
		
		System.out.println(100_000);	//アンダースコアがある数値リテラル	
	}
	/*
	 * リテラルの先頭、末尾には使用できない
	 * 浮動小数点リテラルにある小数点の前後には使用できない
	 * float値を表現するF（もしくはf）及び、long値を表現するL（もしくはl）の前には使用できない
	 * 16進数で使用する　0x　と 2進数で使用する　0b の途中及び前後には使用できない
	 * 
	 * 
	 */
}
