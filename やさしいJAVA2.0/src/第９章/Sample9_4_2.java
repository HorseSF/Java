package 第９章;

class Car_Sample9_4_2{
	private int num;
	private double gas;
	
	public Car_Sample9_4_2(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public Car_Sample9_4_2(int n,double g){
		this();
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
public class Sample9_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample9_4_2 car1 = new Car_Sample9_4_2();
		car1.show();
		
		Car_Sample9_4_2 car2 = new Car_Sample9_4_2(1234,20.5);
		car2.show();
	}

}
