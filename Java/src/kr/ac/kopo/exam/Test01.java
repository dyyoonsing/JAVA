package kr.ac.kopo.exam;

public class Test01 {
	
	public static void main(String[] args) {
		
		String c = "abc";
		byte[] b = c.getBytes();
		for(byte i : b){
			System.out.println(i);
		}
	}

}
