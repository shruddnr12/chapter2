package chapter02;

public class WatchTV {

	public static void main(String[] args) {
		TV tv = new TV(7,20,false);
		
		tv.status();   // 필드 출력
		
		tv.power(true);  // power 멤버변수 변경
		tv.volume(120);  //  0<=volume<=100 사이 유지. 넘어가면 0
		tv.status();
		
		tv.volume(false); // volume 둘이기.
		tv.status();
		
		tv.channel(0);
		tv.status();
		
		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();
		
		tv.power(false);
		tv.status();
	}

}
