package kr.ac.kopo.assignment.day12;

import java.util.Scanner;

public class BoardView {
	
	private Scanner sc;
	
	public BoardView() {
		sc = new Scanner(System.in);
	}
	
	public String printInputString(String str) {
		System.out.print(str);
		String result = sc.nextLine();
		return result;
	}
	
	public int printInputInt(String str) {
		System.out.print(str);
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}
	
	public int printMenu() {
		
		System.out.println("----------------");
		System.out.println("<<게시판 관리 시스템>>");
		System.out.println("----------------");
		System.out.println("1.전체게시물 조회");
		System.out.println("2.글번호 조회");
		System.out.println("3.글등록");
		System.out.println("4.글수정");
		System.out.println("5.글삭제");
		System.out.println("0.종료");
		
		
		System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		return select;
	}
	

}
