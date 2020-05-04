package 第１０章;

class Car10_4_3{
	private int num;
	private double gas;
	private String name;
	
	public Car10_4_3(){
		num = 0;
		gas = 0;
		name = "名無し";
		System.out.println("車を作成しました。");
	}
	
	public void setCar10_4_3(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
	}
	
	public void setName(String nm){
		name = nm;
		System.out.println("名前を" + name + "にしました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("名前は" + name + "です。");
	}
}

public class Sample10_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car10_4_3 car1;
		car1 = new Car10_4_3();
		
		car1.show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "１号車";
		
		car1.setCar10_4_3(number, gasoline);
		car1.setName(str);
		
		car1.show();
	}
}
