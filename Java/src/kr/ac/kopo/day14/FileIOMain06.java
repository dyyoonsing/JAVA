package kr.ac.kopo.day14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

public class FileIOMain06 {
	
	public static void main(String[] args) {

		
		FileReader fr = null;
		FileWriter fw = null;	
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		PrintWriter pw = null;
		
		
		try {
			fr = new FileReader("iotest/FileOIMain03.java");
			fw = new FileWriter("iotest/FileIOMain03-1.java.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			pw = new PrintWriter(fw);
			
			//엔터 제외하고 저장됨! 우리는 엔터도 들어가야하는데??
//			while(true) {
//				String str = br.readLine();
//				if(str == null) break;
//				bw.write(str);
////				bw.write('\n'); //엔터 넣기 위해서! 근데 os 별로 엔터 다르니까 이걸 위한 메소드 - newline
//				bw.newLine();			
//				
//			}
//			bw.flush();
			
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
//				bw.write(str);
//				bw.write('\n'); //엔터 넣기 위해서! 근데 os 별로 엔터 다르니까 이걸 위한 메소드 - newline
				pw.println(str);			
				
			}
			bw.flush();
			
			
			
			
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			FileClose.close(br, bw);
			FileClose.close(fr, fw);
			FileClose.close(pw);
			
			
			
			
			//모든 buffered는 reader와 writer를 상속받음  -- 
			//FileClose 클래스의 메소드들을 file에만 한정하지 않고 buffered까지 받을 수 있게 writer, reader로 받는다.
//			FileClose.close(br);
//			FileClose.close(bw);
//			
//			FileClose.close(fr);
//			FileClose.close(fw);
			
		}
	}

}







