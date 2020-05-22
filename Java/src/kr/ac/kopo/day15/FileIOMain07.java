package kr.ac.kopo.day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

/*
 * 콘솔에서 명령어를 입력하여 원본 파일을 대상 파일에 저장하는 프로그램
 * $ java FileIOMain07		aaa.txt		bbb.txt
 */
public class FileIOMain07 {
	
	public static void main(String[] args) {
		
		//String[] args는 위 예시에서의 aaa.txt bbb.txt 부분에 해당한다.
		//run - configurations arguments 추가
		
//		System.out.println("args length : " + args.length);
		
		if(args.length < 2) {
			
			System.out.println("명령문이 잘못되었습니다.");
			System.out.println("사용법 : java FileIOMain07  원본파일명   복사대상파일명");
			System.exit(0);			
		}
//		System.out.println(Arrays.toString(args));
		
		File oriFile = new File(args[0]);
//		if(!oriFile.exists()) {
//			System.out.println("파일이 존재하지 않습니다.");
//			System.exit(0);
//		}
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader(args[0]);
//			fr = new FileReader(oriFile);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(args[1]);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				bw.write(data);
				bw.newLine();
			}
			bw.flush();
			
			System.out.println("복사완료");
			
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally{
			FileClose.close(br, fr);
			FileClose.close(bw, fw);
		}
		
		
		
		
		
		
	}

}
