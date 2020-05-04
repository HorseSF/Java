package 第１５章;

class Car15_1_1 extends Thread{
	private String name;
	
	public Car15_1_1(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample15_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15_1_1 car1 = new Car15_1_1("１号車");
		car1.start();
		
		Car15_1_1 car2 = new Car15_1_1("２号車");
		car2.start();
		
		for(int i=0; i<5; i++){
			System.out.println("main()の処理をしています。");
		}
	}

}
