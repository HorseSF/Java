package 第２章;

public class GreetingLoop {
	public static void main(String[] args){
		String[] greeting = {"おはよう","こんにちは","こんばんは"};
		int i;int j;
		
		for(j=5;j>0;j--)
		{
			for(i=0;i<greeting.length;i++)
			{
				if(i>0)
				{
					System.out.print(" ");
				}
				System.out.print(greeting[i]);
			}
			System.out.println();
			}
		}
}
