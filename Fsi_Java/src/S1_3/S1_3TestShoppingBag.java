package S1_3;

/*********************************************************************
 *	S1_3
 *	S1_3TestShoppingBag.java
 *
 *	S1_3のShoppingBagクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printShoppingBag()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S1_3TestShoppingBag{
	
	public static void main(String[] args){
		ShoppingBag shoppingBag;
		int money  = 2000;
		Goods goods = new Goods("海洋深層水", 1200);
		
		String test;
		
		System.out.println();
		System.out.println("** S1_3のShoppingBagクラスの単体テスト **");
		
		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag();
		if(shoppingBag != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);
		
		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag(money);
		if(shoppingBag != null && shoppingBag.getMoney() == money ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);
		
		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag();
		shoppingBag.setMoney(money);
		shoppingBag.setGoods(goods);
		if( money == shoppingBag.getMoney() && goods.equals(shoppingBag.getGoods())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);
		
		// Test4:業務ロジック printShoppingBag()のテスト
		System.out.println("---");
		test = "NG";
		shoppingBag = new ShoppingBag(money);
		shoppingBag.setGoods(goods);
		System.out.println("Test4.1:業務ロジック printShoppingBag()のテスト");
		System.out.println("↓次の行に「買物かご情報」が表示されていればテストOK");
		shoppingBag.printShoppingBag();
		
		System.out.println("---");
		shoppingBag = new ShoppingBag(money);
		System.out.println("Test4.2:業務ロジック printShoppingBag()の例外処理テスト");
		System.out.println("↓次の行の「買物かご情報」に「商品は入っていません。」と表示されていればテストOK");
		shoppingBag.printShoppingBag();
	}
}
