package 第１５章;

class Car15_2_1 extends Thread{
	private String name;
	
	public Car15_2_1(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			try{
				sleep(1000);
				System.out.println(name + "の処理をしています。");
			}
			catch(InterruptedException e){
				
			}
		}
	}
}

public class Sampler15_2_1 {
	public static void main(String args[]){
		Car15_2_1 car1 = new Car15_2_1("１号車");
		car1.start();
		
		for(int i=0;i<5;i++){
			System.out.println("main()の処理をしています。");
		}
	}
}
