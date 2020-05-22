package kr.ac.kopo.day13.lotto01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoView {
	
	private Scanner sc;
	
	public LottoView(){
		sc = new Scanner(System.in);
	}
	
	public void start() {
		System.out.print("게임수를 입력하세요 : ");
		int gameCount = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= gameCount; i++) {
			System.out.println("게임 "+ i + " : "+getLottoNums());
		}
		
	}
	
	private String getLottoNums() {
		
		final int LOTTO_MAX = 6;
//		Random r = new Random();
		List<Integer> lottoNums = new ArrayList<>();
		
		//방법5
		List<Integer> nums = new ArrayList<>();
		for(int i = 1; i <= 45; i++) {
			nums.add(i);
		}
		//System.out.println(Arrays.toString(lottoNums.toArray()));
		Collections.shuffle(nums);
		//System.out.println(Arrays.toString(lottoNums.toArray()));
		//셔플된 상황에서 6개 뽑기
		
		for(int i = 0; i < LOTTO_MAX; i++) {
			lottoNums.add(nums.get(i));
		}
				
		
		
		/*
		//방법4
		Set<Integer> lottoNums = new TreeSet<>();
		while(lottoNums.size() < LOTTO_MAX) {
			lottoNums.add(r.nextInt(45)+1);
//			System.out.println("!");
		}
		*/
			
		
		
		
		
		// 방법3
//		List<Integer> lottoNums = new ArrayList<>();
//		while(lottoNums.size() < LOTTO_MAX) {
//			int num = r.nextInt(45) +1;
//			if(!lottoNums.contains(num)) {
//				lottoNums.add(num);
//			}else {
//				System.out.println("!"); //에러체크
//			}
//		}

		
		return Arrays.toString(lottoNums.toArray());
	}

}
