package 第９章;

class Car_Sample9_5_1{
	public static int sum = 0;
	private int num;
	private double gas;
	
	public Car_Sample9_5_1(){
		num = 0;
		gas = 0;
		sum++;
		System.out.println("車は作成しました。");
	}
	
	public void setCar(int n,double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public static void showSum(){
		System.out.println("車は全部で" + sum + "台あります。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample9_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample9_5_1.showSum();
		
		Car_Sample9_5_1 car1 = new Car_Sample9_5_1();
		car1.setCar(1234, 20.5);
		
		Car_Sample9_5_1.showSum();
		
		Car_Sample9_5_1 car2 = new Car_Sample9_5_1();
		car2.setCar(4567, 30.5);
		
		Car_Sample9_5_1.showSum();
	}

}
