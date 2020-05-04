package S1_4;

//商品クラスを生成する
public class Goods {
	private String goodsName;//商品名
	private int price;//単価
	public Goods(){
	}
	
	//商品の情報をセットするコンストラクタ
	public Goods(String goodsName,int price){
		this.goodsName = goodsName;//商品名
		this.price = price;//値段
	}
		
	//セッター商品名
	public void setGoodsName(String goodsName){
		this.goodsName = goodsName;
	}
	
	//セッター値段
	public void setPrice(int price){
		this.price = price;
	}
		 
	//ゲッター商品名
	public String getGoodsName(){
		return goodsName;
	}
		 
	//ゲッター値段
	public int getPrice(){
		return price;
	}
		 
	//商品情報を表示する
	public void printGoods(){
		System.out.println("  (Goods) " + goodsName + " " + price + "円");
	}
}

