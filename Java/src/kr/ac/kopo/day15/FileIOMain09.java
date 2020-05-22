package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileIOMain09 {
	
	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; 	//필터 클래스
		/*원래 바이트 단위로 들어가는데, 이젠 object단위로 넣는 것! 객체가 갖고 있는 정보들을 byte stream이 가질 수 있도록 -> 객체 직렬화
		 * NotSerializalbeException이 바로 객체 직렬화 안되어있다는 것 - serializable 객체를 상속받으면 된다.
		 * 
		 * 제외하고 싶은 필드가 있으면 변수 선언할때 transient를 붙인다
		 * 
		 * 결과가 이상한문자로 나옴?? 알아서 맞춰서 들어가있음
		*/
		try {
			fos = new FileOutputStream("iotest/object_user.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(user);
			System.out.println("저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	
	
	public static void read() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object_user.txt");
			ois = new ObjectInputStream(fis);
			
			UserInfo user = (UserInfo)ois.readObject();		//명시적 형변환이 필요함
			
			System.out.println("로드 완료...");
			System.out.println(user);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
//		write();
		read();
	}

}
