package 第３章;

public class StartUp3_2_5 {
	public static void main(String[] args){
		System.out.println("今日の利率：" + Account3_2_5.getInterest());
		
		System.out.println("以下の２つの口座を開設します。");
		Account3_2_5 account1 = new Account3_2_5("山野");
		Account3_2_5 account2 = new Account3_2_5("森田",200000f);
		
		System.out.println("------------------");
		account1.print();
		System.out.println("------------------");
		account2.print();
		System.out.println("------------------");
		
		System.out.println("1年後の残高は？");
		account1.interestAt();
		account2.interestAt();
		
		System.out.println("------------------");
		account1.print();
		System.out.println("------------------");
		account2.print();
		System.out.println("------------------");
	}
}
