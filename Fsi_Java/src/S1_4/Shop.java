package S1_4;

public class Shop{
	private String shopName;  // 店名
	private String telNo;   // 電話番号
	private Goods goods;   //商品

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

/*
* 商品を販売する
*/
	public void saleGoods(String goodsName,ShoppingBag shoppingBag){
	//商品がある場合はお金が足りることとお金が足りないことがある。
		if(goodsName.equals(goods.getGoodsName())){
			if(shoppingBag.getMoney()>=goods.getPrice()){
				int balance = shoppingBag.getMoney()- goods.getPrice(); 
				System.out.println("  (Shop) "+ shopName + "「" + goodsName + "は" + goods.getPrice() +"円です。まいどあり！おつりは" + balance + "円です。" );
				shoppingBag.setMoney(balance);
				shoppingBag.setGoods(goods);
			}else{
				System.out.println("  (Shop) "+ shopName + "「" + goodsName + "は" + goods.getPrice() +"円です。お金が足りません。");
			}
		}
		//商品がない場合
		else{
				System.out.println("  (Shop) "+ shopName + "「" + goodsName + "は取り扱っていません。申し訳ありません。」");
			}
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
* @return 電話番号
*/
	public String getTelNo(){
		return telNo;
	}
	
	public Goods getGoods(){
		return goods;
	}
}