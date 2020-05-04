package S1_1;

/****************************************************************************
 *	S1_1
 *	Shop.java
 * 
 *	All Right Reserved, Copyright(c) Fujitsu Learning Media Limited
 ****************************************************************************/

public class Shop{
	private String shopName;		// 店名
	private String telNo;			// 電話番号
	
	/**
	 * 引数のないコンストラクタ
	 */
	public Shop(){
	}
	
	/**
	 * 商店の情報をセットするコンストラクタ
	 * @param shopName 店名
	 * @param telNo 電話番号
	 */
	public Shop(String shopName, String telNo){
		this.shopName = shopName;
		this.telNo = telNo;
	}
	
	/**
	 * 商店の情報を表示する。
	 */
	public void printShop(){
		String info = "(Shop) " + shopName + "です。 TEL:" + telNo;
		System.out.println(info);
	}
	
	/**
	 * セッター（店名）
	 * @param shopName 店名
	 */
	public void setShopName(String shopName){
		this.shopName = shopName;
	}
	
	/**
	 * セッター（電話番号）
	 * @param telNo 電話番号
	 */
	public void setTelNo(String telNo){
		this.telNo = telNo;
	}
	
	/**
	 * ゲッター（店名）
	 * @return 店名
	 */
	public String getShopName(){
		return shopName;
	}
	
	/**
	 * ゲッター（電話番号）
	 * @return 	電話番号
	 */
	public String getTelNo(){
		return telNo;
	}
}
