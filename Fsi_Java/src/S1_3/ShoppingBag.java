package S1_3;

/****************************************************************************
 *	S1_3
 *	ShoppingBag.java
 ****************************************************************************/

class ShoppingBag {
	private int money;
	private Goods goods;
		
	public ShoppingBag(){	
	}
	
	public ShoppingBag(int money){
		this.money = money;
	}
	
	//try{
	public void printShoppingBag(){
		String info = "  (ShoppingBag) " + "限度額 " + money + "円";
		System.out.println(info);
		try{
			goods.printGoods();
		}catch(NullPointerException e){
			System.out.println("  (ShoppingBag) " + "商品は入っていません。");
		}
	}	
	
	public void setMoney(int money){
		this.money = money;
	}
	
	public void setGoods(Goods goods){
		this.goods = goods;
	}
	
	public int getMoney(){
		return money;
	}
	
	public Goods getGoods(){
		return goods;
	}
}
