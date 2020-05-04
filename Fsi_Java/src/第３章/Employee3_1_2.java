package 第３章;

public class Employee3_1_2 {
	private int id;
	private String name;
	private String section;
	private String phone;
	
	public void setId(int pId){
		id = pId;
	}
	public void setName(String pName){
		name = pName;
	}
	public void setSection(String pSection){
		section = pSection;
	}
	public void setPhone(String pPhone){
		phone = pPhone;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getSection(){
		return section;
	}
	public String getPhone(){
		return phone;
	}
	
	public void print(){
		System.out.println("ID：" + id);
		System.out.println("NAME：" + name);
		System.out.println("SECTION：" + section);
		System.out.println("PHONE：" + phone);
	}
}
