package 第１５章;

class Car15_2_3 extends Thread{
	private String name;
	
	public Car15_2_3(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample15_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15_2_3 car1 = new Car15_2_3("１号車");
		car1.start();
		
		try{
			car1.join();
		}
		catch(InterruptedException e){
			
		}
		System.out.println("main（）の処理を終わります。");
	}
}
