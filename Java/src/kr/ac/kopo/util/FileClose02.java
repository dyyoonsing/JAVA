package kr.ac.kopo.util;

import java.io.Reader;
import java.io.Writer;

public class FileClose02 {
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			} 
		}
	}
	
	
	//묵시적 형변환으로 writer를 받게 해서 자식들(filewriter, bufferedwriter)
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	
	public static void close(Reader br, Reader r) {
		close(br);
		close(r);
	}
	
	public static void close(Writer bw, Writer w) {
		close(bw);
		close(w);
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}

}
