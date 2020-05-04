package 第１５章;

class Car15_3_1 implements Runnable{
	private String name;
	
	public Car15_3_1(String nm){
		name = nm;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample15_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15_3_1 car1 = new Car15_3_1("１号車");
		Thread th1 = new Thread(car1);
		th1.start();
		
		for(int i=0;i<5;i++){
			System.out.println("main（）の処理をしています。");
		}
	}
}
