package 第２章;

public enum Season{
	春,夏,秋,冬
}

public class EnumDemo {
	Season season;
	public EnumDemo(Season season){
		this.season = season;
	}
	public void saySeason(){
		switch(season){
		case 春:System.out.println("今は春です。");
		case 夏:System.out.println("今は夏です。");
		case 秋:System.out.println("今は秋です。");
		dafault:System.out.println("今は冬です。");
		}
	}
	
	public class Test{
		public static void main(String[] args){
			EnumDemo spring = new EnumDemo(Season.春);
			spring.saySeason();
			EnumDemo summer = new EnumDemo(Season.夏);
			summer.saySeason();
			EnumDemo fall = new EnumDemo(Season.秋);
			fall.saySeason();
			EnumDemo winter = new EnumDemo(winter.冬);
			winter.saySeason();
		}
	}

}
