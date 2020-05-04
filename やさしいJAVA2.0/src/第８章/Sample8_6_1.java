package 第８章;

class Car_Sample8_6_1{
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
	
	void setNumGas(int n,double g){
		num = n;
		gas = g;
		System.out.println("車のアンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample8_6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car_Sample8_6_1 car1 = new Car_Sample8_6_1();
		
		car1.setNumGas(1234, 20.5);
		
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("サンプルから車を調べたところ");
		System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");		
	}

}
