package 第１３章;

public class Sample_NumberTest_13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String numstr = "xyz";
			int val = Integer.parseInt(numstr);
			System.out.println("val=" + val);
		}catch(NumberFormatException e){
			System.out.println("例外" + e);
		}
	}

}
