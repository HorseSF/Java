package 第３章;

public class StartUp3_1_4 {
	public static void main(String[] args){
		Stock3_1_4 test = new Stock3_1_4();
		
		test.setCode("AA001");
		test.setQuantity(1000);
		
		Stock3_1_4.reduceStock(100);
		
		int quantity = Stock3_1_4.getStockQuantity();
		
		System.out.println("変更後の在庫数：" + quantity);
	}
}
