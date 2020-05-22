package kr.ac.kopo.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class FileIOMain08 {
	
	public static void write() {
		
		UserInfo user = new UserInfo("홍길동", 25, "경기도 광명시");	//저장하자 - 한글이 들어가니까 문자 스트림이 더 낫겟네
		System.out.println(user);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("iotest/userInfo.txt");
			bw = new BufferedWriter(fw);
			
			//tostring으로 저장하는게 아님! 필요한것만 저장하기 위해선...
			//한줄로 출력되니까 각각의 정보를 어떻게 뽑을건가?? 1. enter 구별자 	2. 키보드로 입력이 불가능한 문자를 사이에 넣는다
			bw.write(user.getName() + ":" + user.getAge() + ":" + user.getAddr());
			bw.newLine();
			bw.flush();
//			bw.write(user.getAge());	//로드형이기 때문에 물음표박스나와도 괜춘. 텍스트 형태로 하나씩 출력되는 것이기 때문
//			bw.write(user.getAddr());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(bw,fw);
		}
	}
	
	
	
	public static void read() {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("iotest/userInfo.txt");
			br = new BufferedReader(fr);
			
			//data 하나만 하니까 여기선 반복문 안돌림
			String data = br.readLine();
			String[] dataArr = data.split(":");
//			System.out.println(Arrays.toString(dataArr));
			String name = dataArr[0];
			int age = Integer.parseInt(dataArr[1]);
			String addr = dataArr[2];
			UserInfo user = new UserInfo(name, age, addr);
			
			System.out.println("userInfo.txt 로드완료...");
			
			System.out.println(user);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(br,fr);
		}
	}
	
	
	
	public static void main(String[] args) {
//		write();
		read();
		
	}

}
