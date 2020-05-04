package 第４章;

public class Sample4_2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dnum = 160.5;
		
		System.out.println("身長は" + dnum + "センチです。");
		
		System.out.println("int型の変数に代入します。");
		
		//小さなサイズの型には代入できません。
		//int inum = dnum;
		//System.out.println("身長は" + inum + "センチです。");
		
		int inum = (int)dnum;
		System.out.println("身長は" + inum + "センチです。");
	}

}
