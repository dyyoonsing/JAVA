package kr.ac.kopo.day14;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	
	public static void main(String[] args) {
		
		File dirObj = new File("iotest");
		
		boolean bool = dirObj.exists();
		System.out.println(bool? "유효한 디렉토리입니다." : "유효하지 않은 디렉토리입니다.");	//원래는 여기서 디렉토리인지 파일인지 알 수 없음 isFile isDirectory로 확인해야
		
		String[] list = dirObj.list();
		System.out.println("----------------");
		System.out.println("\t" + dirObj.list() + "디렉토리 정보");
		System.out.println("----------------");
		for(String element : list) {
			System.out.println(element);
		}
		System.out.println("-------------------");
		
		File newDirObj = new File("iotest/하마");
		System.out.println(newDirObj.mkdir()); // 생성성공 true 생성실패 false - 두번하면 false됨 ( 이미 만들어져있으니까 )
		
		newDirObj = new File("iotest/새폴더/오리");
		System.out.println(newDirObj.mkdirs());  //s 붙이면 중간 폴더가 없는 경우도 만듦
		
		newDirObj.delete(); // 빈 폴더만 지울 수 있음! 만약에 newDirObj = new File("iotest/새폴더/오리") 이면 지울수 없다! 위에서 안에 오리 파일을 넣어놨으니까
		
		/*
		//file 객체  -  window 탐색기에서 할 수 있는 것들은 거의 다 할 수 있다
		
		File fileObj = new File("iotest\\aaa.txt");
//		File fileObj = new File("C:\\hanati\\workspace\\Java\\iotest\\aaa.txt\r\n");
		
		 String name = fileObj.getName();
		System.out.println("name : " + fileObj.getName());  //child가 name임
		System.out.println("parent : " + fileObj.getParent());
		System.out.println("path : " + fileObj.getPath());
		System.out.println("AB path : "+ fileObj.getAbsolutePath()); //절대경로
		
		boolean bool = fileObj.isFile();
		System.out.println(bool? "파일입니다" : "디렉토리입니다");

		boolean bool2 = fileObj.isDirectory();
		System.out.println(bool2? "디렉토리입니다" : "파일입니다");
		
		//파일이 없는 상황이기 때문에 둘다 false가 나오는 것임
		
		boolean bool3 = fileObj.exists();
		System.out.println(name + (bool3? "존재" : "존재x"));
		
		long length = fileObj.length(); //리턴타입 long형
		System.out.println("파일 크기 : " + length + "byte(s)");
		
		long lastTime = fileObj.lastModified();	//밀리세컨즈 형태
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("마지막 수정시간 : " + sdf.format(new Date(lastTime)));
		
		
		bool = fileObj.canWrite();
		System.out.println(bool? "쓰기가능" : "쓰기 불가능"); //읽기전용하면 쓰기 불가능나옴
		
		bool = fileObj.canRead();
		System.out.println(bool? "읽기가능" : "읽기 불가능"); 
		
		*/
	}

}
