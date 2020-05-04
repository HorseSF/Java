package 第１０章;

class Car10_5_1{
	private int num;
	private double gas;
	
	public Car10_5_1(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
	
	public void setCar10_5_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}

public class Sample10_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10_5_1 cars[]= new Car10_5_1[3];
		
		for(int i=0;i<cars.length;i++){
			cars[i] = new Car10_5_1();
		}
		
		cars[0].setCar10_5_1(1234, 20.5);
		cars[1].setCar10_5_1(2345, 30.5);
		cars[2].setCar10_5_1(3456, 40.5);
		
		for(int i=0;i<cars.length;i++){
			cars[i].show();
		}
	}
}
