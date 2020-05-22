package kr.ac.kopo.exam;

public class Car {
	
	private String name;
	private int num;
	
	public Car() {
		
		System.out.println("이건차!!");
	}
	
	public Car(String name, int num) {
		
		this();
			
		num++;
		this.name = name;
		this.num = num;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
