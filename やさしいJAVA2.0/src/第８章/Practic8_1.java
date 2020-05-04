package 第８章;

class MyPoint_Practic8_1{
	int x;
	int y;
	
	void setX(int px){
		x = px;
	}
	
	void setY(int py){
		y = py;
	}
	
	int getX(){
		return x;
	}
	
	int getY(){
		return y;
	}
}
public class Practic8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint_Practic8_1 p1 = new MyPoint_Practic8_1();
		p1.setX(10);
		p1.setY(15);
		
		int a = p1.getX();
		int b = p1.getY();
		
		System.out.print(a+","+b);
	}

}
