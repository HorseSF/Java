package 第１１章;

public class Practic_GamePlayer_11_1 {
	public String playername;
	public Practic_GamePlayer_11_1(String name){
		playername = name;
	}
	
	public String toString(){
		return "[player:" + playername + "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practic_GamePlayer_11_1[] player = new Practic_GamePlayer_11_1[3];
		player[0] = new Practic_GamePlayer_11_1("M");
		player[1] = new Practic_GamePlayer_11_1("X");
		player[2] = new Practic_GamePlayer_11_1("F");
		for(int i=0;i<player.length;i++){
			System.out.println(player[i]);
		}
	}
}
