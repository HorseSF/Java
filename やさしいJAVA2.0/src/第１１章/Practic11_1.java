package 第１１章;

class Car11_1{
	protected int num;
	protected double gas;
	
	public Car11_1(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar11_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public String toString(){
		String str = "ナンバー" + num + "ガソリン量" + gas + "の車です。";
		return str;
	}
}
public class Practic11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11_1 car1 = new Car11_1();
		car1.setCar11_1(1234, 20.5);
		System.out.println(car1);
	}
}
