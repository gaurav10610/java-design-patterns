package structural.adapter;

public class VLCPlayer implements AdvanceMediaPlayer {

	@Override
	public void playMP4() {
		// Do nothing
	}

	@Override
	public void playVLC() {
		System.out.println("Playing VLC");

	}

}
