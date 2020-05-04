package 第８章;
class Car_Sample8_3_1{
	int num;
	double gas;
}

class Sample8_3_1 {
	public static void main(String[] args){
		Car_Sample8_3_1 car1 = new Car_Sample8_3_1();
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("車のナンバーは" + car1.num + "です。");
		System.out.println("ガソリン量は" + car1.gas + "です。");
	}
}
