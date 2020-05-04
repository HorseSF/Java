package 第２章;

public class Array {
	public static void main(String[] args){
		String[] array ={"one","two","three"};
		int i;
		
		//System.out.println(Array.toString(array));???
		
		for(i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println("配列の要素数：" + array.length);
	}
}
