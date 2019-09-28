package structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	public void playMp4(String music) {
		System.out.println("Playing MP4..."+ music);
	}

}
