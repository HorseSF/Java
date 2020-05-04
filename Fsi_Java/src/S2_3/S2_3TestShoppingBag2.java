package S2_3;

import java.util.*;
/*********************************************************************
 *	S2_3
 *	S2_3TestShoppingBag2.java
 *
 *	S2_3のShoppingBag2クラスの単体テスト用クラス
 *	テスト内容：
 *		Test1:引数のないコンストラクタのテスト
 *		Test2:その他のコンストラクタとゲッターのテスト
 *		Test3:ゲッター・セッターのテスト
 *		Test4:業務ロジック printShoppingBag()のテスト
 *		Test5:業務ロジック setGoods()のテスト
 *
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 *********************************************************************/

public class S2_3TestShoppingBag2{
	
	public static void main(String[] args){
		ShoppingBag2 bag;
		int money  = 2000;
		ArrayList<Goods> goodsList = new ArrayList<Goods>();
		goodsList.add(new Goods("海洋深層水", 1200));		// 商品リストに、商品を登録する。
		goodsList.add(new Goods("ビタミンＡＢＣ", 350));
		
		String test;
		
		System.out.println();
		System.out.println("** S2_3のShoppingBag2クラスの単体テスト **");
		
		// Test1:引数のないコンストラクタのテスト
		System.out.println("---");
		test = "NG";
		bag = new ShoppingBag2();
		if(bag != null){
			test = "OK";
		}
		System.out.println("Test1:引数のないコンストラクタのテスト = " + test);
		
		// Test2:その他のコンストラクタとゲッターのテスト
		System.out.println("---");
		test = "NG";
		bag = new ShoppingBag2(money);
		if(bag != null && bag.getMoney() == money && bag.getBuyGoodsList() != null ){
			test = "OK";
		}
		System.out.println("Test2:その他のコンストラクタとゲッターのテスト = " + test);
		
		// Test3:ゲッター・セッターのテスト
		System.out.println("---");
		test = "NG";
		bag = new ShoppingBag2();
		bag.setBuyGoodsList(goodsList);
		if(goodsList.equals(bag.getBuyGoodsList())){
			test = "OK";
		}
		System.out.println("Test3:ゲッター・セッターのテスト = " + test);
		
		// Test4:業務ロジック printShoppingBag()のテスト
		System.out.println("---");
		test = "NG";
		bag = new ShoppingBag2(money);
		bag.setBuyGoodsList(goodsList);
		System.out.println("Test4:業務ロジック printShoppingBag()のテスト");
		System.out.println("↓次の行の「買物かご情報」に複数の「商品情報」が表示されていればテストOK");
		bag.printShoppingBag();
		
		// Test5:業務ロジック setGoods()のテスト
		System.out.println("---");
		test = "NG";
		bag = new ShoppingBag2(money);
		bag.setBuyGoodsList(goodsList);
		int num1 = bag.getBuyGoodsList().size();
		
		bag.setGoods(new Goods("天然黒酢", 890));
		bag.setGoods(new Goods("アガリクス", 2000));
		int num2 = bag.getBuyGoodsList().size();
		if(num2-num1 == 2){
			test = "OK";
		}
		System.out.println("Test5:業務ロジック setGoods()のテスト = " + test);
		bag.printShoppingBag();
	}
}
