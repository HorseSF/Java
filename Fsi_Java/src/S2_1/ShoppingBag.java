package S2_1;

public class ShoppingBag {
	private int money;
	private Goods goods;

//買い物かごを生成する
	public ShoppingBag(){
	}

//買い物かごの情報をセットするコンストラクタ
	public ShoppingBag(int money){
		this.money = money;
	}

//セッター値段
	public void setMoney(int money){
		this.money = money;
	}

//セッター商品
	public void setGoods(Goods goods){
		this.goods = goods;
	} 

//ゲッター値段
	public int getMoney(){
		return money;
	} 

//ゲッター商品
	public Goods getGoods(){
		return goods;
	} 

//例外処理
//買い物かご情報を表示する
	public void printShoppingBag(){
		try{
			System.out.println("  (ShoppingBag) 限度額 " + money + "円");
			goods.printGoods();
		}catch(NullPointerException e){
			System.out.println("  (ShoppingBag) 商品は入っていません。");
		}
	}
}