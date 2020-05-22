package kr.ac.kopo.day14;

import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("입력하세요. 종료는 ctrl + z입니다.");
		
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		
		
		try {
			while(true) {
				int c = isr.read();
				if( c== -1) break;
				System.out.print((char)c);
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			while(true) {			
//				int c = is.read();
//				if( c == -1 ) break;
//				System.out.print((char)c);	//입력버퍼		enter는 13 10 \r\n
//			}
//			
//		}catch(Exception e) {
//				e.printStackTrace();
//			}
		
		
		}
	}



