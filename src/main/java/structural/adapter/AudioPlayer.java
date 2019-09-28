package structural.adapter;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter adapter;

	public void play(String audioType, String filneName) {
		if (audioType.equals("mp3")) {
			System.out.println("Playing mp3..." + filneName);
		} else {
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, filneName);
		}
		
	}

	

}
