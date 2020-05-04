package S2_1;

/****************************************************************************
 *	S2_1
 *	S2_1TestShop1.java
 *
 *	S2_1のShop1クラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック createGoodsList()のテスト
 *		Test5:業務ロジック createGoods()のテスト
 *		Test6:業務ロジック printShop()のテスト
 *		Test7:業務ロジック saleGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 ****************************************************************************/

public class S2_1TestShop1{
	
	public static void main(String[] args){
		Shop1 shop;
		String shopName = "東京店";
		String telNo = "03-1234-5678";
		int money = 1200;
		String goodsName = "海洋深層水";
		Goods[] goodsList	= new Goods[2];
		
		String test;
		
		System.out.println();
		System.out.println("** S2_1のShop1クラスの単体テスト **");
		
		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop1();
		if(shop != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);
		
		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop1(shopName, telNo);
		if(shop != null && shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo())){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);
		
		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop1();
		shop.setGoodsList(goodsList);
		if(goodsList.equals(shop.getGoodsList())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);
		
		// Test4:業務ロジック createGoodsList()のテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop1(shopName, telNo);
		int nn = 10;
		shop.createGoodsList(nn);
		if(nn == shop.getGoodsList().length ){
			test = "OK";
		}
		System.out.println("Test4:業務ロジック createGoodsList()のテスト = " + test);
		
		// Test5:業務ロジック createGoods()のテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop1(shopName, telNo);
		nn = 10;
		shop.createGoodsList(nn);
		shop.createGoods(0,goodsName, money);
		if(goodsName.equals(shop.getGoodsList()[0].getGoodsName()) ){
			test = "OK";
		}
		System.out.println("Test5:業務ロジック createGoods()のテスト = " + test);
		
		// Test6:業務ロジック printShop()のテスト
		System.out.println("---");
		test = "NG";
		goodsList[0] = new Goods(goodsName, money);		// 商品リストに、商品を登録する。
		goodsList[1] = new Goods("ビタミンＡＢＣ", 350);
		shop = new Shop1();
		shop.setShopName(shopName);
		shop.setTelNo(telNo);
		shop.setGoodsList(goodsList);
		System.out.println("Test6.1:業務ロジック printShop()のテスト");
		System.out.println("↓次の行に、「商店情報」に複数の「商品情報」が表示されていればテストOK");
		shop.printShop();
		
		System.out.println("---");
		goodsList[1] = null;
		System.out.println("Test6.2:業務ロジック printShop()の例外処理テスト");
		System.out.println("↓次に「商品情報」《NullPointerException》が表示され、かつ処理が継続すればテストOK");
		shop.printShop();
		
		// Test7:業務ロジック saleGoods()のテスト
		System.out.println("---");
		ShoppingBag bag  = new ShoppingBag(money);
		ShoppingBag bag1 = new ShoppingBag(money + 1);
		ShoppingBag bag2 = new ShoppingBag(money);
		ShoppingBag bag3 = new ShoppingBag(money - 1);
		
		goodsList[0] = new Goods(goodsName, money);		// 商品リストに、商品を登録する。
		goodsList[1] = new Goods("ビタミンＡＢＣ", 350);
		shop = new Shop1(shopName, telNo);
		shop.setGoodsList(goodsList);
		
		System.out.println("Test7:業務ロジック saleGoods()のテスト");
		
		test = "NG";
		shop.saleGoods("XXX", bag);
		if(bag.getGoods() == null && bag.getMoney() == money){
			test = "OK";
		}
		System.out.println("「該当する商品がない場合のテスト」" + test);
		
		test = "NG";
		shop.saleGoods(goodsName, bag1);
		if(bag1.getGoods().getGoodsName() == goodsName && bag1.getMoney() == 1){
			test = "OK";
		}
		System.out.println("「商品が販売できた場合のテスト(1)」" + test);
		
		test = "NG";
		shop.saleGoods(goodsName, bag2);
		if(bag2.getGoods().getGoodsName() == goodsName && bag2.getMoney() == 0){
			test = "OK";
		}
		System.out.println("「商品が販売できた場合のテスト(2)」" + test);
		
		test = "NG";
		shop.saleGoods(goodsName, bag3);
		if(bag3.getGoods() == null && bag3.getMoney() == money - 1){
			test = "OK";
		}
		System.out.println("「限度額が足りなかった場合のテスト」" + test);
	}
}
