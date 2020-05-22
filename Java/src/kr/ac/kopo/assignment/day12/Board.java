package kr.ac.kopo.assignment.day12;


public class Board {
	

	private String title;
	private String user;
	private String date;

	public Board() {
		
	}
	
	public Board(String title, String user, String date) {
		this.title = title;
		this.user = user;
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
}
