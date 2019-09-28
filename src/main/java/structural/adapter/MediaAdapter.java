package structural.adapter;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if (audioType.equals("MP4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String filneName) {
		advancedMediaPlayer.playMp4(filneName);
		
	}

}
