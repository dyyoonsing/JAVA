package kr.ac.kopo.day15;

import java.io.Serializable;

public class UserVO implements Serializable{
	
	public String 	name;
	public int 		age;
	public String 	phone;
	public String 	addr;
	
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + ", phone=" + phone + ", addr=" + addr + "]";
	}


	public UserVO(String name, int age, String phone, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
	}
	
	
	

}
