package 第３章;

public class StartUp3_1_1 {
	public static void main(String[] args){
		
		Item3_1_1 ballpen = new Item3_1_1();
		ballpen.code = "AA001";
		ballpen.name = "ボールペン";
		ballpen.price = 100;
		ballpen.print();
		
		Item3_1_1 note = new Item3_1_1();
		note.code = "BB0001";
		note.name = "ノート";
		note.price = 150;
		note.print();
	}
}
