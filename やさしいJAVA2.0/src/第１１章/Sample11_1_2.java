package 第１１章;

class Car11_1_2{
	private int num;
	private double gas;
	
	public Car11_1_2(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public Car11_1_2(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void setCar11_1_2(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

class RacingCar11_1_2 extends Car11_1_2{
	private int course;
	
	public RacingCar11_1_2(){
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public RacingCar11_1_2(int n, double g, int c){
		super(n,g);
		course = c;
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println("コースの番号を" + course + "にしました。");
	}
}

public class Sample11_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar11_1_2 rccar1 = new RacingCar11_1_2(1234, 20.5, 5);
		
		rccar1.show();
	}
}
