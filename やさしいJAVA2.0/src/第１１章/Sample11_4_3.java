package 第１１章;

class Car11_4_3{
	protected int num;
	protected double gas;
	
	public Car11_4_3(){
		num = 0;
		gas = 0;
		System.out.println("車を作成しました。");
	}
}

class RacingCar11_4_3 extends Car11_4_3{
	private int course;
	
	public RacingCar11_4_3(){
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public void setCourse(int c){
		course = c;
		System.out.println(course);
	}
}

public class Sample11_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11_4_3 cars[];
		cars = new Car11_4_3[2];
		
		cars[0] = new Car11_4_3();
		cars[1] = new RacingCar11_4_3();
		
		//getClass()メソッドはオブジェクトが属するクラスの情報を返す
		for(int i=0;i<cars.length;i++){
			@SuppressWarnings("rawtypes")
			Class c1 = cars[i].getClass();
			System.out.println((i+1) + "番目のオブジェクトのクラスは" + c1 + "です。");
		}
	}

}
