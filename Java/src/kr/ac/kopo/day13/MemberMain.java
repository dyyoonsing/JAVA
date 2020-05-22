package kr.ac.kopo.day13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Member> memberList = new ArrayList<>();
		
		memberList.add(new Member("aaa", "1111"));
		memberList.add(new Member("bbb", "2222"));
		memberList.add(new Member("ccc", "3333"));
		memberList.add(new Member("ddd", "4444"));
		
		System.out.println("입력해");
		String id = sc.nextLine();
		
		Member user = new Member(id);
		boolean bool = memberList.contains(user);
		//equals 메소드를 만들어주면 contains를 쓸 수 있음 - contains도 equals 비교한다는 뜻! equals 중요중요
		
		
		if(!bool) {
			System.out.println("아이디 존재안함");
			System.exit(0);
		}
		
		int index = memberList.indexOf(user);
		System.out.println("현재 패스워드를 입력하세요 : ");
		String password = sc.nextLine(); //현재 아이디의 패스워드 먼지 알아야 함
		if(!memberList.get(index).getPassword().equals(password)) {
			System.out.println("잘못된 패스워드입니다.시스템 종료함");
			System.exit(0);				//얘네 예외처리하면 됨 checkIDPASSException
		}
		
		System.out.println("변경할 패스워드를 입력하셈 : ");
		String newPassword = sc.nextLine();
		memberList.remove(index);
		memberList.add(index, new Member(id, newPassword));			//원래 방식은 지우고 다시 넣기(remove, add)
//		memberList.set(index, new Member(id, newPassword)); 		set으로 가능
		
		
		Iterator<Member> ite = memberList.iterator();
		whire(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}

}
