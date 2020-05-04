package 第８章;

class Car4{
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
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample4 {
	public static void main(String[] args){
		Car4 car1 = new Car4();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}
}
