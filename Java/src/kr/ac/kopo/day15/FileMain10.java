package kr.ac.kopo.day15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import kr.ac.kopo.util.FileClose;

/*
 * UserVO
 */
public class FileMain10 {
	
	
	public static void write() {
		
		List<UserVO> list = new ArrayList<>();
		
		list.add(new UserVO("홍길동", 25, "010-2222-2222", "서울시 서초구"));
		list.add(new UserVO("윤길동", 30, "010-2122-1303", "서울시 성북구 안암동"));
		list.add(new UserVO("강길동", 26, "010-7844-5689", "경기도 성남시 분당구"));
		list.add(new UserVO("최길동", 54, "010-7552-1807", "부산시 남구"));
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("iotest/userName.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);							//여기서 묵시적 형변환이 됨
			//ArrayList에는 serializable 받음
			System.out.println("저장 완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//			FileClose.close(fos);
		}
	}
	
	
	
	public static void read() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/userName.txt");
			ois = new ObjectInputStream(fis);
			
			
			/*이렇게 할수는 잇지만 안에 데이터가 몇개 있는지 모르니까(4개) 아니면 while(true) EOFException 발생할때 break 예외처리하면 또 됨
			 * for(int i = 0; i < 4 ; i++){
			 * 		UserVO user = (UserVO)ois.readObject;
			 * 		list.add(user)
			 * }
			 * 
			 * 아니면
				 * try {
					while(true) {
						UserVO user = (UserVO)ois.readObject();
						list.add(user);
					}
				} catch (EOFException e) {
					// TODO: handle exception 빠져나가면 되니까 break 필요 없음
				}
			 * 
			 */
			
			
			//list도 객체!
			List<UserVO> list = (List<UserVO>)ois.readObject();			//여기서 명시적 형변환
			
			System.out.println("로드완료...");
			//UserVO에서 toSTring을 했으니까 이렇게 나옴
			System.out.println(list);
			
//			for(UserVO u : list) {
//				System.out.print(u);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		write();
		read();
	}

}
