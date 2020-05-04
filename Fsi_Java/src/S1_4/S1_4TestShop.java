package S1_4;

/****************************************************************************
 *	S1_4
 *	S1_4TestShop.java
 *
 *	S1_4のShopクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック createGoods()のテスト
 *		Test5:業務ロジック printShop()のテスト
 *		Test6:業務ロジック saleGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 ****************************************************************************/

public class S1_4TestShop{
	
	public static void main(String[] args){
		Shop shop;
		String shopName = "東京店";
		String telNo = "03-1234-5678";
		String goodsName = "海洋深層水";
		int price = 1200;
		Goods goods = new Goods(goodsName, price);
		
		String test;
		
		System.out.println();
		System.out.println("** S1_4のShopクラスの単体テスト **");
		
		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop();
		if(shop != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);
		
		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop(shopName, telNo);
		if(shop != null && shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo()) ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);
		
		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop();
		shop.setShopName(shopName);
		shop.setTelNo(telNo);
		shop.setGoods(goods);
		if(shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo()) && goods.equals(shop.getGoods())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);
		
		// Test4:業務ロジック createGoods()のテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop(shopName, telNo);
		shop.createGoods(goodsName, price);
		if(goodsName.equals(shop.getGoods().getGoodsName()) && price == shop.getGoods().getPrice() ){
			test = "OK";
		}
		System.out.println("Test4:業務ロジック createGoods()のテスト = " + test);
		
		// Test5:業務ロジック printShop()のテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop(shopName, telNo);
		shop.setGoods(goods);
		System.out.println("Test5:業務ロジック printShop()のテスト");
		System.out.println("↓次の行に、「商店情報」が表示されていればテストOK");
		shop.printShop();
		
		// Test6:業務ロジック saleGoods()のテスト
		System.out.println("---");
		ShoppingBag bag  = new ShoppingBag(price);
		ShoppingBag bag1 = new ShoppingBag(price + 1);
		ShoppingBag bag2 = new ShoppingBag(price);
		ShoppingBag bag3 = new ShoppingBag(price - 1);
		
		shop = new Shop(shopName, telNo);
		shop.setGoods(goods);
		
		System.out.println("Test6:業務ロジック saleGoods()のテスト");
		
		test = "NG";
		shop.saleGoods("XXX", bag);
		if(bag.getGoods() == null && bag.getMoney() == price){
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
		if(bag3.getGoods() == null && bag3.getMoney() == price - 1){
			test = "OK";
		}
		System.out.println("「限度額が足りなかった場合のテスト」" + test);
	}
}
