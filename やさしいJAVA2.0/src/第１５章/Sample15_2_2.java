package 第１５章;

class Car15_2_2 extends Thread{
	private String name;
	
	public Car15_2_2(String nm){
		name = nm;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name + "の処理をしています。");
		}
	}
}

public class Sample15_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15_2_2 car1 = new Car15_2_2("１号車");
		car1.start();
		
		for(int i=0;i<5;i++){
			try{
				Thread.sleep(1000);
				System.out.println("main（）の処理をしています。");
			}
			catch(InterruptedException e){
				
			}
		}
	}

}
