package _05_class._interface;

public class CdPlayer implements Music {
	@Override
	public void play(String song) {
		System.out.printf("CD 플레이어에서 '%s' 음악을 재생합니다. %n", song);
	}

	@Override
	public void stop(String song) {
		System.out.printf("CD 플레이어에서 '%s' 음악을 재생합니다. %n", song);
	}

}
