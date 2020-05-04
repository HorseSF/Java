package S2_1;

//顧客クラスを生成する
	public class Customer {
		private String customerName; //顧客名前
		private ShoppingBag shoppingBag;//顧客の買い物かご
	 
	public Customer(){
	}
	 
//顧客情報をセットするコンストラクタ
	public Customer(String customerName){
		this.customerName = customerName;//顧客名前
	}
	public void createBag(int money){
		shoppingBag = new ShoppingBag(money);
	}

//セッター顧客名前
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	} 

//セッター買い物かご
	public void setShoppingBag(ShoppingBag shoppingBag){
		this.shoppingBag = shoppingBag;
	}

//ゲッター顧客名前
	public String getCustomerName(){
		return customerName;
	}
	
//ゲッター買い物かご
	public ShoppingBag getShoppingBag(){
		return shoppingBag;
	}
	
//顧客情報を表示する
	public void printCustomer(){
		System.out.println("(Customer) " + customerName + "さんの買い物かご");
		shoppingBag.printShoppingBag();
	}
	
//商店への問い合わせ
	public void queryShop(Shop shop){
		System.out.println("(Customer) " + customerName + "「この店は何店ですか？」");
		shop.printShop();
	}

//商品を買う
	public void buyGoods(Shop shop,String goodsName){
		System.out.println("(Customer) " + customerName + "「"+ goodsName + "をください。」");
		shop.saleGoods(goodsName, shoppingBag);
	}
}