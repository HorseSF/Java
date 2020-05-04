package 第８章;

class Car3{
	int num;
	double gas;
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	void showCar3(){
		System.out.println("これから車の情報を表示します。");
		show();
	}
}

public class Sample3 {
	public static void main(String[] args){
		Car3 car1;
		car1 = new Car3();
		
		car1.num = 1234;
		car1.gas = 20.5;
		
		car1.showCar3();
	}
}
