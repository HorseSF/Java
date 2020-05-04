package Chapter_001;

public class Java_SilverSE8_C001_S005 {

	float x1 = 3_.1415F;
	//コンパイルエラー
	//小数点の前は使用できない
	
	float x2 = 3._1415F;
	//コンパイルエラー
	//小数点の後は使用できない
	
	long x3 = 999_99_9999_L;
	//コンパイルエラー
	//long値を表すサフィックス（Lもしくはl）の前には使用できない
	
	int x4 = _52;
	//コンパイルエラー
	//リテラルの前頭には使用できない
	
	int x5 = 5_2;
	//OK
	//リテラルの途中は使用可能
	
	int x6 = 52_;
	//コンパイルエラー
	//リテラルの末尾には使用できない
	
	int x7 = 5______2;
	//OK
	//_の使用回数に制限はないため、使用可能
	
	int x8 = 0_x52;
	//コンパイルエラー
	//１６進数を表現する０xの途中には使用できない
	
	int x9 = 0x_52;
	//コンパイルエラー
	//１６進数を表現する０xの直後には使用できない
	
	int x10 = 0x5_2;
	//OK
	//リテラルの途中は使用可能
	
	int x11 = 0_52;
	//OK
	//８進数を表す０の直後は使用可能
	
}
