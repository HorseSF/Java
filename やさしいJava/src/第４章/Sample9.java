package 第４章;
//型変換(小さなサイズの型に代入します。)
//丢失精度

public class Sample9 {
	public static void main(String[] args)
	{
		double dnum = 160.5;
		System.out.println("身長は" + dnum + "センチです。");
		System.out.println("int型の変数に代入します。");
		int inum = (int) dnum;
		System.out.println("身長は" + inum + "センチです。");
	}

}
