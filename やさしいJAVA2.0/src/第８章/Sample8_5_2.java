package 第８章;

class Car_Sample8_5_2{
	int num;
	double gas;
	
	void setNumGas(int n,double g){
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample8_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample8_5_2 car1 = new Car_Sample8_5_2();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number, gasoline);
	}
}
