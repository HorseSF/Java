package 第８章;

class Car6{
	int num;
	double gas;
	
	int getNum(){
		System.out.println("ナンバーを調べました。");
		return num;
	}
	double getGas(){
		System.out.println("ガソリン量を調べました。");
		return gas;
	}
	void setNumGas(int n, double g){
		num = n;
		gas = g;
		System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample6 {
	public static void main(String[] args){
		Car6 car1 = new Car6();
		
		car1.setNumGas(1234,20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		
		System.out.println("サンプルから車を調べたところ");
		System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");
	}
}
