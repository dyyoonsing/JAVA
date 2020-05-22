package kr.ac.kopo.day13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * MAP : key, value 쌍으로 이루어진 집합(순서 X, 중복 허용X -> key에 대한 중복X)
 * 	- HashMap
 *  - TreeMap 
 *  아이디와 비밀번호 관리가 그 예가 될 수 있겠지 (중복 불가능한 key를 아이디, value는 비밀번호)
 *  
 *  비밀번호 변경 서비스를 만들어보자
 */


public class MapMain {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		//key : 아이디, value : 비밀번호
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		System.out.println("패스워드 변경 서비스입니다.");
		System.out.print("변경할 아이디를 입력하세요  : ");
		String id = sc.nextLine();
		
		if(!map.containsKey(id)) {
			System.out.println("입력하신 아이디 [" + id +"]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0); 
		}
		
		System.out.print("현재 패스워드를 입력하세요 : ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드를 변경하였습니다");
		
		
		
		System.out.println("< 전체 회원 목록 >");
		
		Set<Entry<String, String>> entry = map.entrySet();
//		for(Entry<String, String> e : entry) {
//			System.out.println("id : "+ e.getKey() + ", password : " + e.getValue());}
//		
		Iterator<Entry<String, String>> ite = entry.iterator();
		while(ite.hasNext()) {
			Entry<String, String> e = ite.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println("id : "+ key + ", password : " + value);
		}
		
						
//		
//		Set<String> keys = map.keySet();
//		for(String key : keys) {
//			System.out.println("id : " + key + " // pwd : " + map.get(key));
//			
//		}
		
	}

}
