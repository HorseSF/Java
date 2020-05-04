package S1_2;

/****************************************************************************
 *	S1_2
 *	S1_2TestShop.java
 *
 *	S1_2のShopクラスの単体テスト用クラス
 * 
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック createGoods()のテスト
 *		Test5:業務ロジック printShop()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 ****************************************************************************/

public class S1_2TestShop{
	
	public static void main(String[] args){
		Shop shop;
		String shopName = "東京店";
		String telNo = "03-1234-5678";
		String goodsName = "海洋深層水";
		int price = 1200;
		Goods goods = new Goods(goodsName,price);
		
		String test;
		
		System.out.println();
		System.out.println("** S1_2のShopクラスの単体テスト **");
		
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
	}
}
