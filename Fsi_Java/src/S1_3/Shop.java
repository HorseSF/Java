package S1_3;


/****************************************************************************
 *	S1_3
 *	Shop.java
 ****************************************************************************/

class Shop{
	private String shopName;		// 店名
	private String telNo;			// 電話番号
	private Goods goods;
	
	/**
	 * 引数のないコンストラクタ
	 */
	public Shop(){
	}
	
	/**
	 * 商店の情報をセットするコンストラクタ
	 * @param shopName 店名
	 * @param telNo 電話番号
	 */
	public Shop(String shopName, String telNo){
		this.shopName = shopName;
		this.telNo = telNo;
	}

	public void createGoods(String goodsName,int price){
		goods = new Goods(goodsName,price);
	}
	
	/**
	 * 商店の情報を表示する。
	 */
	public void printShop(){
		String info = "(Shop) " + shopName + "です。 TEL:" + telNo;
		System.out.println(info);
		goods.printGoods();
	}
	
	/**
	 * セッター（店名）
	 * @param shopName 店名
	 */
	public void setShopName(String shopName){
		this.shopName = shopName;
	}
	
	/**
	 * セッター（電話番号）
	 * @param telNo 電話番号
	 */
	public void setTelNo(String telNo){
		this.telNo = telNo;
	}
	
	public void setGoods(Goods goods){
		this.goods = goods;
	}
	
	/**
	 * ゲッター（店名）
	 * @return 店名
	 */
	public String getShopName(){
		return shopName;
	}
	
	/**
	 * ゲッター（電話番号）
	 * @return 	電話番号
	 */
	public String getTelNo(){
		return telNo;
	}
	
	public Goods getGoods(){
		return goods;
	}
}

