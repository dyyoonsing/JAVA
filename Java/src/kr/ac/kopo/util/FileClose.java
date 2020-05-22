package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


public class FileClose {


	   //모든 FileWriter, BufferedWriter는 Writer를 상속받는다 (Reader도 마찬가지) ==> 묵시적 형변환이 일어나게된다.
	   //모두 오버라이딩을 한다.
	   // 중복을 줄인다!
	   public static void close(InputStream ois) {
	      if(ois != null) {
	         try {
	            ois.close();
	         }catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }
	   public static void close(OutputStream ois) {
	      if(ois != null) {
	         try {
	            ois.close();
	         }catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }
	   public static void close(Reader fr) {
	      if(fr != null) {
	         try {
	            fr.close();
	         }catch(Exception e) {
	            e.printStackTrace();
	         }
	      }
	   }
	   
	   public static void close(Writer fw) {
	      if(fw != null) {
	         try {
	            fw.close();
	         }catch(Exception e) {
	            e.printStackTrace();
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
	   
	   
	   //InputStream 
	   public static void close(InputStream fis, InputStream ois) {
	      close(fis);
	      close(ois);
	   }
	   public static void close(OutputStream fos, OutputStream oos) {
	      close(fos);
	      close(oos);
	   }

	

}
