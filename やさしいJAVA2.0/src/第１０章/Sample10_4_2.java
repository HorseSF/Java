package 第１０章;

class Car10_4_2{
	private int num;
	private double gas;
	
	public Car10_4_2(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar10_4_2(int n, double g){
		num = n;
		gas = g;
		System.out.print("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}	
}

public class Sample10_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10_4_2 car1;
		System.out.println("car1を宣言しました。");
		car1 = new Car10_4_2();
		car1.setCar10_4_2(1234, 20.5);
		
		Car10_4_2 car2;
		System.out.println("car2を宣言島hした。");
		
		car2 = car1;
		System.out.println("car2にcar1を代入しました。");
		
		System.out.println("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();
		
		System.out.println("car1がさす車に変更を加えます。");
		car1.setCar10_4_2(2345, 30.5);
		
		System.out.println("car1がさす");
		car1.show();
		System.out.println("car2がさす");
		car2.show();
	}
}
