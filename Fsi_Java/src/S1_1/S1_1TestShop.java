package S1_1;

/****************************************************************************
 *	S1_1
 *	S1_1TestShop.java
 *
 *	S1_1のShopクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printShop()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 ****************************************************************************/

public class S1_1TestShop{
	
	public static void main(String[] args){
		Shop shop;
		String shopName = "東京店";
		String telNo = "03-1234-5678";
		String test;
		
		System.out.println();
		System.out.println("** S1_1のShopクラスの単体テスト **");
		
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
		if(shop != null && shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo())){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);
		
		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shop = new Shop();
		shop.setShopName(shopName);
		shop.setTelNo(telNo);
		if(shopName.equals(shop.getShopName()) && telNo.equals(shop.getTelNo()) ){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);
		
		// Test4:業務ロジック printShop()のテスト
		System.out.println("---");
		shop = new Shop(shopName, telNo);
		System.out.println("Test4:業務ロジック printShop()のテスト");
		System.out.println("↓次の行に、「商店情報」が表示されていればテストOK");
		shop.printShop();
	}
}
