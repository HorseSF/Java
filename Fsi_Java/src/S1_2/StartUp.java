package S1_2;


/****************************************************************************
 *	S1_2
 *	StratUp.java
 ****************************************************************************/

public class StartUp{
	private Shop tokyoShop;
	private Shop osakaShop;

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
		tokyoShop.createGoods("海洋深曽水",1200);
		osakaShop = new Shop("大阪店", "06-2222-7777");
		osakaShop.createGoods("ビタミンABC",350);
	}
	
	// テスト
	public void test(){
		System.out.println();
		tokyoShop.printShop();			// 「東京店」の商店情報を表示する。
		osakaShop.printShop();			// 「大阪店」の商店情報を表示する。
	}
}
