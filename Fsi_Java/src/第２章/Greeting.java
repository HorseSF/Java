package 第２章;

public class Greeting {
	public static void main(String[] args){
		String[] greeting = {"おはよう","こんにちは","こんばんは"};
		int i;
		
		for(i=0;i<greeting.length;i++){
			if(i>=0)
			{
				System.out.print(" ");
			}
		System.out.print(greeting[i]);
		}
	}
}
