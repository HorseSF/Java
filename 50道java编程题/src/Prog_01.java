/*
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子对数为多少？
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
public class Prog_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println("第" + n + "个月兔子的总数为" + fun(n));
	}
	private static int fun(int n){
		if(n==1||n==2){
			return 1;
		}else{
			return fun(n-1) + fun(n-2);
		}
	}
}
