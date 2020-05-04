package 第１２章;

interface iVehicle12_3_1{
	void vshow();
}

interface iMaterial12_3_1{
	void mshow();
}

class Car12_3_1 implements iVehicle12_3_1, iMaterial12_3_1{
	private int num;
	private double gas;
	
	public Car12_3_1(int n, double g){
		num = n;
		gas = g;
		System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
	}
	
	public void vshow(){
		System.out.println("車のナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
	}
	
	public void mshow(){
		System.out.println("車の材質は鉄です。");
	}
}

public class Sample12_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car12_3_1 car1 = new Car12_3_1(1234, 20.5);
		car1.vshow();
		car1.mshow();
	}

}
