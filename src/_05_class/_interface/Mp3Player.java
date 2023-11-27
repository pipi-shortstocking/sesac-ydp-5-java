package _05_class._interface;

public class Mp3Player implements Music {
	@Override
	public void play(String song) {
		System.out.printf("MP3 플레이어에서 '%s' 음악을 재생합니다. %n", song);
	}

	@Override
	public void stop(String song) {
		System.out.printf("MP3 플레이어에서 '%s' 음악을 정지합니다. %n", song);
	}
	
}
