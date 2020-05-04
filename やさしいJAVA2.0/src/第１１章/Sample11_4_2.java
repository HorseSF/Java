package 第１１章;

class Car11_4_2{
	protected int num;
	protected double gas;
	
	public Car11_4_2(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
}

public class Sample11_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11_4_2 car1 = new Car11_4_2();
		Car11_4_2 car2 = new Car11_4_2();
		
		Car11_4_2 car3 = new Car11_4_2();
		car3 = car1;
		
		//２つの変数がさしているオブジェクトが同じである場合に、trueを戻り値として返す
		boolean bl1 = car1.equals(car2);
		boolean bl2 = car1.equals(car3);
		
		System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
		System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");
	}

}
