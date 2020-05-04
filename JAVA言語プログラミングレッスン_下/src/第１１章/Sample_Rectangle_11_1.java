package 第１１章;

class Sample_Rectangle_11_1 {
	int width;
	int height;
	Sample_Rectangle_11_1(){
		setSize(10,20);
	}
	
	Sample_Rectangle_11_1(int w, int h){
		setSize(10,20);
	}
	
	void setSize(int w,int h){
		width = w;
		height = h;
	}
	
	int getArea(){
		return width * height;
	}
	
	public static void main(String[] args){
		Sample_Rectangle_11_1 r1 = new Sample_Rectangle_11_1();
		System.out.println("r1.width = " + r1.width);
		System.out.println("r1.height = " + r1.height);
		System.out.println("r1.getArea() = " + r1.getArea());
		
		Sample_Rectangle_11_1 r2 = new Sample_Rectangle_11_1(123,45);
		System.out.println("r2.width = " + r2.width);
		System.out.println("r2.height = " + r2.height);
		System.out.println("r2.getArea() = " + r2.getArea());
		
	}
	
}
