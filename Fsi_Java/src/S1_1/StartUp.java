package S1_1;

/****************************************************************************
	 *	S1_1
	 *	StratUp.java
	 *
	 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
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
			osakaShop = new Shop("大阪店", "06-2222-7777");
		}
		
		// テスト
		public void test(){
			System.out.println();
			tokyoShop.printShop();			// 「東京店」の商店情報を表示する。
			osakaShop.printShop();			// 「大阪店」の商店情報を表示する。
		}
	}

