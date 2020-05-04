package 第２章;

public class Argument {
	public static void main(String[] args){
		int count=args.length;
		int sum=0;
		for(int i=0;i<count;i++){
			sum+=Integer.parseInt(args[i]);
		}
		System.out.println(args[0] + "+" + args[1] + "=" + sum);
	}
}
