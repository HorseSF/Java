package 第８章;

class Car_Sample8_5_1{
	int num;
	double gas;
	
	void setNum(int n){
		num = n;
		System.out.println("ナンバーを" + num + "にしました。");
	}
	
	void setGas(double g){
		gas = g;
		System.out.println("ガソリン量を" + gas + "にしました。");
	}
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量を" + gas + "です。");
	}
}

public class Sample8_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample8_5_1 car1 = new Car_Sample8_5_1();
		car1.setNum(1234);
		car1.setGas(20.5);
		
		int number = 2345;
		double gasoline = 30.5;
		car1.setNum(number);
		car1.setGas(gasoline);
	}
}
