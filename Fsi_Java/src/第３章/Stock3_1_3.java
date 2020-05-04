package 第３章;

public class Stock3_1_3 {
	private String code;
	private int stockQuantity;
	
	public void setCode(String pCode){
		code = pCode;
	}
	public void setStockQuantity(int pStockQuantity){
		stockQuantity = pStockQuantity;
	}
	
/*	
	public String pCode(){
		return code;
	}
	public int pStockQuantity(){
		return stockQuantity;
	}
*/	
	
	public void print(){
		System.out.println("商品コード：" + code);
		System.out.println("在庫数：" + stockQuantity);
	}
}
