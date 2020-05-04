package 第３章;

public class Account3_2_5 {
	private static float interest = 0.002f;
	private String name;
	private float balance;
	
	public Account3_2_5(String name){
		this.name = name;
	}
	public Account3_2_5(String name,float balance){
		this.name = name;
		this.balance = balance;
	}
	
	public void print(){
		System.out.println("NAME:" + name);
		System.out.println("BALANCE" + balance);
	}
	public void interestAt(){
		balance = interest*balance + balance;
	}
	public static float getInterest(){
		return interest;
	}
}
