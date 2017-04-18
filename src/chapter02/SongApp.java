package chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song("좋은날","아이유","Real","이민수",3,2010);
		song.show();
		
//		song.setAlbum("Real");
//		song.setArtist("아이유");
//		song.setComposer("이민수");
//		song.setTitle("좋은날");
//		song.setTrack(3);
//		song.setYear(2010);
		
		Song song2 = new Song("She's Baby","지코");
		song2.show();
		
		Song song3 = new Song("얼굴 찌푸리지 말아요","하이라이트");
		song3.show();
	
	}

}
