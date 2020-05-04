package S2_1;

public class Shop1 extends Shop{
	
	private Goods[] goodsList;
	
	public Shop1(){
		super();
	}
	
	public Shop1(String shopName,String telNo){
		super(shopName, telNo);
	}
	
	public void createGoodsList(int nn){
		goodsList = new Goods[nn];
	}
	
	public void createGoods(int nn,String goodsName,int price){
		for(nn=0;nn<4;nn++){
		super.createGoods(goodsName, price);
		Goods goods = new Goods(goodsName, price);
		super.getGoods();
		goodsList[nn] = getGoods();	
		}
	}
	
	public void printShop(){
		try{
		System.out.println("(Shop) " + getShopName() + "です。 TEL:" + getTelNo());
		for(int i=0;i<4;i++){ 
			Goods goods = goodsList[i];
			goods.printGoods();
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println(e.getMessage());
		}
	}
	
	public void saleGoods(String goodsName,ShoppingBag shoppingBag){
		for(int i=0;i<4;i++){
			if(goodsName != goodsList[i].getGoodsName()){
				super.setGoods(getGoods());
			}
			if(goodsName == goodsList[i].getGoodsName()){
				break;
			}
		}
		super.saleGoods(goodsName, shoppingBag);
		getGoods().getGoodsName();
		
		if(goodsName.equals(getGoods().getGoodsName())){
			if(shoppingBag.getMoney()>=getGoods().getPrice()){
				int balance = shoppingBag.getMoney()- getGoods().getPrice(); 
				System.out.println("  (Shop) "+ getShopName() + "「" + goodsName + "は" + getGoods().getPrice() +"円です。まいどあり！おつりは" + balance + "円です。" );
				shoppingBag.setMoney(balance);
				shoppingBag.setGoods(getGoods());
			}else{
				System.out.println("  (Shop) "+ getShopName() + "「" + goodsName + "は" + getGoods().getPrice() +"円です。お金が足りません。");
			}
		}
		//商品がない場合
		else{
				System.out.println("  (Shop) "+ getShopName() + "「" + goodsName + "は取り扱っていません。申し訳ありません。」");
			}
	}
	
	
	public void setGoodsList(Goods[] goodsList){
		this.goodsList = goodsList;
	}
	
	public Goods[] getGoodsList(){
		return goodsList;
	}
}
