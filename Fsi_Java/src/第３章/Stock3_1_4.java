package 第３章;

public class Stock3_1_4 {
	private String code;
	private int stockQuantity;
	
	public void setCode(String pCode){
		code = pCode;
	}
	public void setQuantity(int pStockQuantity){
		stockQuantity = pStockQuantity;
	}
	public String getCode(){
		return code;
	}
	public int getStockQuantity(){
		return stockQuantity;
	}
	public void reduceStock(int quantity){
		stockQuantity -= quantity;
	}
	public void print(){
		System.out.println("商品コード：" + code);
		System.out.println("在庫数：" + stockQuantity);
	}
}
