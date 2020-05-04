package 第８章;

class Car_Sample8_4_2{
	int num;
	double gas;
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
	void showCar(){
		System.out.println("これから車の情報を表示します。");
		show();
	}
}


public class Sample8_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample8_4_2 car1 = new Car_Sample8_4_2();
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar();
	}

}
