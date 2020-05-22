package kr.ac.kopo.day15;

import java.io.Serializable;

/*
 * VO 클래스 (value object) 
 * 변수나 값만을 저장하는 클래스
 * 
 * <기본>
 * 		alt + shift + s
 * 기본생성자 						: 	+ c
 * 매개변수 생성자 					: 	+ o
 * getter/setter				: 	+ r
 * toString()메소드 overriding 	: 	+ s
 * override 메소드 자동완성 			: 	+ v
 */
public class UserInfo implements Serializable {
	//상속받기만 하면 io에서 이걸 직렬화해줌
	private 			String name;
	private transient	int age;				//이 키워드를 써주면 객체 직렬화에서 이 필드가 제외됨
	private transient	String addr;
	
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public UserInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}



	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	
}
