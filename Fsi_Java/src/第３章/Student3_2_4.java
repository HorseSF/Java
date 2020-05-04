package 第３章;

public class Student3_2_4 {
	private String name;
	private int math;
	private int chemistry;
	private int physics;

	public Student3_2_4(String pName,int pMath,int pChemistry,int pPhysics){
		name = pName;
		math = pMath;
		chemistry = pChemistry;
		physics = pPhysics;
	}
	
	public String getName(){
		return name;
	}
	public int getMath(){
		return math;
	}
	public int getChemistry(){
		return chemistry;
	}
	public int getPhysics(){
		return physics;
	}
	
	public int getTotal(){
		return math + chemistry + physics;
	}
}
