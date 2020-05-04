package 第１４章;

class CarException14_3_1 extends Exception{
	
}

class Car14_3_1{
	private int num;
	private double gas;
	
	public Car14_3_1(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar14_3_1(int n, double g)throws CarException14_3_1{
		if(g<0){
			CarException14_3_1 e = new CarException14_3_1();
			throw e;
		}else{
			num = n;
			gas = g;
			System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
		}
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample14_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car14_3_1 car1 = new Car14_3_1();
		try{
			car1.setCar14_3_1(1234, -10);
		}
		catch(CarException14_3_1 e){
			System.out.println(e + "が送出されまhした。");
		}
		car1.show();
	}
}
