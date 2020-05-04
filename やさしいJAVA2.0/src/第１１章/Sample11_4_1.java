package 第１１章;

class Car11_4_1{
	protected int num;
	protected double gas;
	
	public Car11_4_1(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar11_4_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	//toString()メソッド
	//オブジェクトを文字列で表したものを戻り値として返す
	public String toString(){
		String str = "ナンバー：" + num + "ガソリン量:" + gas;
		return str;
	}
}

public class Sample11_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11_4_1 car1 = new Car11_4_1();
		car1.setCar11_4_1(1234, 20.5);
		
		//car1を出力するときtoString()メソッドが呼び出されます。	
		System.out.println(car1);
	}
}
