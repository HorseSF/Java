package S1_3;

/****************************************************************************
 *	S1_3
 *	Customer.java
 ****************************************************************************/

class Customer {
	private String customerName;
	private ShoppingBag shoppingBag;
	
	public Customer(){
	}
	
	public Customer(String customerName){
		this.customerName = customerName;
	}
	
	public void createBag(int money){
		shoppingBag = new ShoppingBag(money);
	}
	
	public void printCustomer(){
		String info = "(Customer) " + customerName + "さんの買物かご";
		System.out.println(info);
			shoppingBag.printShoppingBag();
	}
		
	public void queryShop(Shop shop){
		String info = "(Customer) " + customerName + " 「この店は何店ですか？」";
		System.out.println(info);
		shop.printShop();
	}
	
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	
	public void setShoppingBag(ShoppingBag shoppingBag){
		this.shoppingBag = shoppingBag;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	
	public ShoppingBag getShoppingBag(){
		return shoppingBag;
	}
}
