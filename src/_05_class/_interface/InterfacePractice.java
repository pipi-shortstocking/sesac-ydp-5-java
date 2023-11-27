package _05_class._interface;

public class InterfacePractice {
	public static void main(String[] args) {
		Music music;
		String song;
		
		music = new Mp3Player();
		song = "아이유 블루밍";
		System.out.println("=== MP3 Player ===");
		music.play(song);
		music.stop(song);
		
		System.out.println();
		
		music = new CdPlayer();
		song = "아이유 꽃갈피";
		System.out.println("=== CD Player ===");
		music.play(song);
		music.stop(song);
	}
}
