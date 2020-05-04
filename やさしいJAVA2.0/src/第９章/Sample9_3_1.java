package 第９章;

class Car_Sample9_3_1{
	private int num;
	private double gas;
	
	public Car_Sample9_3_1(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample9_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample9_3_1 car1 = new Car_Sample9_3_1();
		car1.show();
	}

}
