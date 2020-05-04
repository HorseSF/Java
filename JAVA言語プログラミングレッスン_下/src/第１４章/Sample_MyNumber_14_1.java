package 第１４章;

class Sample_MyNumber_14_1 implements DebugPrintable{
	int a;
	public Sample_MyNumber_14_1(int a){
		this.a = a;
	}
	@Override
	public void debugPrint(){
		System.out.println("MyNumberのインスタンス：aの値は" + a + "です。");
	}
}