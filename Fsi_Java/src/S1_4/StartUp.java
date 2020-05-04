package S1_4;

public class StartUp {
	public static void main(String[] args) {

//商店オブジェクトを生成する
	Shop tokyo = new Shop();

//メンバ変数に値を代入する
	tokyo.setShopName("東京店");
	tokyo.setTelNo("03-1234-5678");
	
//海洋深層水を生成する
	tokyo.createGoods("海洋深層水", 1200);
	
//山田さんを生成する
	Customer yamada = new Customer();
	yamada.setCustomerName("山田");
	
//山田さんの買い物かごを生成する
	yamada.createBag(2000);

//商店情報の表示メソッド呼び出し
	System.out.println();
	yamada.printCustomer();  
//山田さんは商品を購入する
	System.out.println();
	yamada.buyGoods(tokyo,"アロエはちみつ");
	tokyo.saleGoods("アロエはちみつ",yamada.getShoppingBag());
	System.out.println();
	yamada.buyGoods(tokyo,"海洋深層水");
	tokyo.saleGoods("海洋深層水", yamada.getShoppingBag());
	System.out.println();
	yamada.buyGoods(tokyo,"海洋深層水");
	tokyo.saleGoods("海洋深層水",yamada.getShoppingBag());
	System.out.println();
	yamada.printCustomer();
	
	}
}