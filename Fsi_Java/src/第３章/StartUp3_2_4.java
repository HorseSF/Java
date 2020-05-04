package 第３章;

public class StartUp3_2_4 {
	public static void main(String[] args){
		Student3_2_4[] data = { new Student3_2_4("磯村",77,62,80),
							    new Student3_2_4("浜野",60,82,89),
							    new Student3_2_4("海戸",86,75,90),
							    new Student3_2_4("水田",70,75,70),
								new Student3_2_4("滝田",90,88,89)	  
							  };
							  
		int total = 0;
		for(int i=0;i < data.length;i++){
			total +=data[i].getTotal();
		}
		double ave;
		ave = (double)total/data.length;
		
		for(int i=0;i < data.length;i++){
			System.out.print(data[i].getName() + " >> ");
			System.out.print(data[i].getMath() + ":");
			System.out.print(data[i].getChemistry() + ":");
			System.out.print(data[i].getPhysics()+ " ");
			System.out.print("合計：" + data[i].getTotal());
			System.out.println();
		}
		System.out.println("------------------------");
		System.out.println("平均：" + ave + "点");
	}
}
