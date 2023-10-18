package structural.adapter;

public class MediaAdapter implements MediaPlayer {
	AdvanceMediaPlayer advanceMediaPlayer;

	public MediaAdapter(String mediaType) {
		if (mediaType.equals("MP4")) {
			advanceMediaPlayer = new MP4Player();
		} else if (mediaType.equals("VLC")) {
			advanceMediaPlayer = new VLCPlayer();
		}
	}

	@Override
	public void play(String mediaType) {
		if (mediaType.equals("MP4")) {
			advanceMediaPlayer.playMP4();
		} else if (mediaType.equals("VLC")) {
			advanceMediaPlayer.playVLC();
		}

	}

}
