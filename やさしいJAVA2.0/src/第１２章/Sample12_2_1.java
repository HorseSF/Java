/*
 * インターフェイス
 */

package 第１２章;

interface iVehicle12_2_1{
	void show();
}

class Car12_2_1 implements iVehicle12_2_1{
	private int num;
	private double gas;
	
	public Car12_2_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void show(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
}
	
class Plane12_2_1 implements iVehicle12_2_1{
	private int flight;
	
	public Plane12_2_1(int f){
		flight = f;
		System.out.println("便" + flight + "の飛行機を作成しました。");
	}
	
	public void show(){
		System.out.println("飛行機の便は" + flight + "です。");
	}
}

public class Sample12_2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVehicle12_2_1 ivc[];
		ivc = new iVehicle12_2_1[2];
		
		ivc[0] = new Car12_2_1(1234, 20.5);
		ivc[1] = new Plane12_2_1(232);
		
		for(int i=0;i<ivc.length;i++){
			ivc[i].show();
		}
	}
}
