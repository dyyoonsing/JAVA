package kr.ac.kopo.day14;

import java.io.FileReader;
import java.io.FileWriter;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {
	
	//iotest/FileIOMain03.java -> iotest/FileIOMain03.java.txt 복사
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			
			fr = new FileReader("iotest/FileOIMain03.java");
			fw = new FileWriter("iotest/FileIOMain03.java.txt");
			
			while(true) {
				int c = fr.read();
//				System.out.println(c);
				if(c == -1) break;
//				System.out.print((char)c);
				fw.write(c);
			}
			fw.flush();
			
			System.out.println("복사가 완료되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			FileClose.close(fr);
			
//			if(fr != null) {
//				try {
//					fr.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
			
			FileClose.close(fw);
			
//			if(fw != null) {
//				try {
//					fw.close();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
						
		}
				
	}

}
