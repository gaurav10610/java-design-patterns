package structural.adapter;

/**
 * The Adapter Pattern is also known as Wrapper.
 * <p>
 * Advantages:
 * 	- It allows two or more previously incompatible objects to interact.
 * 	- It allows reusability of existing functionality.
 */
public class MainClass {

	public static void main(String[] args) {
		MediaPlayer mediaPlayer = new AudioPlayer();
		mediaPlayer.play("VLC");
		mediaPlayer.play("MP3");
	}

}
