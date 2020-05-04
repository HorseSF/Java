package S1_2;

/*********************************************************************
 *	S1_2
 *	S1_2TestGoods.java
 *
 *	S1_2のGoodsクラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S1_2TestGoods{
	
	public static void main(String[] args){
		Goods goods;
		String goodsName = "海洋深層水";
		int price  = 1200;
		String test;
		
		System.out.println();
		System.out.println("** S1_2のGoodsクラスの単体テスト **");
		
		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		goods = new Goods();
		if(goods != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);
		
		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		goods = new Goods(goodsName, price);
		if(goods != null && goodsName.equals(goods.getGoodsName()) && price == goods.getPrice() ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);
		
		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		goods = new Goods();
		goods.setGoodsName(goodsName);
		goods.setPrice(price);
		if(goodsName.equals(goods.getGoodsName()) && price == goods.getPrice() ){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);
		
		// Test4:業務ロジック printGoods()のテスト
		System.out.println("---");
		goods = new Goods(goodsName, price);
		System.out.println("Test4:業務ロジック printGoods()のテスト");
		System.out.println("↓次の行に、「商品情報」が表示されていればテストOK");
		goods.printGoods();
	}
}

