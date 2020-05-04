/*
 * 抽象クラスの拡張したサブクラスはどれも、
 * 抽象クラスの抽象メソッド（show()メソッド）と同じ名前のメソッドを持っている 
 */

package 第１２章;

abstract class Vehicle12_1_1{
	protected int speed;
	
	public void setSpeed12_1_1(int s){
		speed = s;
		System.out.println("速度を" + speed + "にしました。");
	}
	abstract void show();
}

class Car12_1_1 extends Vehicle12_1_1{
	private int num;
	private double gas;
	
	public Car12_1_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("速度は" + speed + "です。");
	}
}

class Plane12_1_1 extends Vehicle12_1_1{
	private int flight;
	
	public Plane12_1_1(int f){
		flight = f;
		System.out.println("便" + flight + "の飛行機を作成しました。");
	}
	
	public void show(){
		System.out.println("飛行機の便は" + flight + "です。");
		System.out.println("速度は" + speed + "です。");
	}
}

public class Sample12_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle12_1_1 vc[];
		vc = new Vehicle12_1_1[2];
	
		vc[0] = new Car12_1_1(1234, 20.5);
		vc[0].setSpeed12_1_1(60);
		
		vc[1] = new Plane12_1_1(232);
		vc[1].setSpeed12_1_1(500);
		
		for(int i=0;i<vc.length;i++){
			vc[i].show();
		}
		
		/*
		 * instanceof演算子を使うと、オプジェクトのクラスを調べるということできます。
		 */
		for(int j=0;j<vc.length;j++){
			if(vc[j] instanceof Car12_1_1){
				System.out.println((j+1) + "番目のオプジェクトはCarクラスです。");
			}else{
				System.out.println((j+1) + "番目のオプジェクトはCarクラスではありません。");
			}
		}
	}
}