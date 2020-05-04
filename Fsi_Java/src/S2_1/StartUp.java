package S2_1;

public class StartUp {
	public static void main(String[] args) {

//商店オブジェクトを生成する
	Shop1 tokyo = new Shop1();

//メンバ変数に値を代入する
	tokyo.setShopName("東京店");
	tokyo.setTelNo("03-1234-5678");
	
//海洋深層水を生成する
	tokyo.createGoodsList(5);
	tokyo.createGoods(1,"海洋深層水",1200);
	tokyo.createGoods(2,"ビタミンABC",350);
	tokyo.createGoods(3,"天然黒",890);
	tokyo.createGoods(4,"アガリクス",2000);
	tokyo.createGoods(5,"アロエはちみつ",650);
	
	
//山田さんを生成する
	Customer yamada = new Customer();
	yamada.setCustomerName("山田");
	
//山田さんの買い物かごを生成する
	yamada.createBag(1000);

	tokyo.printShop();
	
	}
}