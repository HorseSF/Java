package 第１１章;

class Practic_RectangleIntersect{
	final int INITIAL_WIDTH = 10;
	final int INITIAL_HEIGHT = 20;
	int width;
	int height;
	int x;
	int y;
	Practic_RectangleIntersect(){
		width = INITIAL_WIDTH;
		height = INITIAL_HEIGHT;
		x = 0;
		y = 0;
	}
	
	Practic_RectangleIntersect(int width, int height){
		this.width = width;
		this.height = height;
		this.x = 0;
		this.y = 0;
	}
	
	Practic_RectangleIntersect(int x, int y, int width, int height){
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
	}
	
	void setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	void setSize(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public String toString(){
		return "[" + x + "," + y + "," + width + "," + height + "]";				
	}
	
	Practic_RectangleIntersect intersect(Practic_RectangleIntersect r){
		int sx = Math.max(this.x, r.x);
		int sy = Math.max(this.y, r.y);
		int ex = Math.min(this.x + this.width, r.x + r.width);
		int ey = Math.min(this.y + this.height, r.y + r.height);
		int newwidth = ex - sx;
		int newheight = ey - sy;
		if(newwidth > 0 && newheight >0){
			return new Practic_RectangleIntersect(sx, sy, newwidth, newheight);
		}else{
			return null;
		}
	}
	
	public static void main(String[] args){
		Practic_RectangleIntersect a, b, c, d, e;
		a = new Practic_RectangleIntersect(0, 0, 20, 10);
		b = new Practic_RectangleIntersect(5, 5, 20, 10);
		c = new Practic_RectangleIntersect(20, 10, 20, 10);
		d = new Practic_RectangleIntersect(-10, -20, 100, 200);
		e = new Practic_RectangleIntersect(21, 11, 20, 10);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		System.out.println("aとaの重なり＝" + a.intersect(a));
		System.out.println("aとbの重なり＝" + a.intersect(b));
		System.out.println("aとcの重なり＝" + a.intersect(c));
		System.out.println("aとdの重なり＝" + a.intersect(d));
		System.out.println("aとeの重なり＝" + a.intersect(e));
	}
}