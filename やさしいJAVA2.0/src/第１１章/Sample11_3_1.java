package 第１１章;

class Car11_3_1{
	protected int num;
	protected double gas;
	
	public Car11_3_1(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar11_3_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class RacingCar11_3_1 extends Car11_3_1{
	private int course;
	
	public RacingCar11_3_1(){
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("コースの番号を" + course + "にしました。");
	}
	
	public void show(){
		System.out.println("レーシングカーのナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("コース番号は" + course + "です。");
	}
}

public class Sample11_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar11_3_1 rccar1 = new RacingCar11_3_1();
		rccar1.setCar11_3_1(1234, 20.5);
		rccar1.setCourse(5);
		
		rccar1.show();
	}
}
