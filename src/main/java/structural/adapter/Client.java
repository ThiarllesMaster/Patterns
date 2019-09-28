package structural.adapter;

public class Client {

	public static void main(String[] args) {
		MediaPlayer media = new AudioPlayer();
		media.play("mp3", "Mp3");
		media.play("MP4", "MP4");
	}
}
