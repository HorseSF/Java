package 第９章;

class MyPoint_Practic9_1{
	private int x;
	private int y;
	
	public MyPoint_Practic9_1(){
		x = 0;
		y = 0;
	}
	
	public MyPoint_Practic9_1(int px,int py){
		x = px;
		y = py;
	}
	
	public void setX(int px){
		x = px;
		System.out.println("X座標を設定する。");
	}
	
	public void setY(int py){
		y = py;
		System.out.println("Y座標を設定する。");
	}
	
	public int getX(){
		
		return x;
	}
	
	public int getY(){
		return y;
	}
}

public class Practic9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint_Practic9_1 p1 = new MyPoint_Practic9_1();
		p1.setX(10);
		p1.setY(5);
		
		int px1 = p1.getX();
		int py1 = p1.getY();
		
		System.out.println("p1のX座標は" + px1 + "Y座標は" + py1 + "でした。");
	}

}
