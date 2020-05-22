package kr.ac.kopo.day13.lotto03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Machine {
	//has a 패턴의 경우(가지고 있다의 표현) 일반적으로 멤버변수화 된다. 머신은 볼을 가지고 있으니까 볼이 멤버변수 
	private List<Ball> balls = new ArrayList<>();
	
	public Machine() {

		for(int i = 1; i <= 45; i++) {
			balls.add(new Ball(i));
		}
	}
	
	public void start() {
		Collections.shuffle(balls);
	}
	
	public Ball getBall() {
		return balls.remove(0); //remove 리턴값은 ball형임
	}

}
