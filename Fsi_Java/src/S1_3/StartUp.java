package S1_3;

/****************************************************************************
 *	S1_3
 *	StratUp.java
 ****************************************************************************/

public class StartUp{
	private Shop tokyoShop;
	private Customer yamada;
	
	// シナリオ
	public static void main(String[] args){
		StartUp client = new StartUp();
		client.initial();
		client.test();
	}
	
	// 初期設定
	public void initial(){
		// 商店のオブジェクトを生成
		tokyoShop = new Shop("東京店", "03-1234-5678");
		tokyoShop.createGoods("海洋深層水",1200);
		yamada = new Customer("山田");
		yamada.createBag(1000);
	}
	
	// テスト
	public void test(){
		System.out.println();
		yamada.printCustomer();
		System.out.println();
		yamada.queryShop(tokyoShop);
	}
}
