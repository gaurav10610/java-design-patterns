package structural.adapter;

public class AudioPlayer implements MediaPlayer {
  MediaAdapter mediaAdapter;
  
  @Override
  public void play(String mediaType) {
    if(mediaType.equals("MP4") || mediaType.equals("VLC")) {
      mediaAdapter = new MediaAdapter(mediaType);
      mediaAdapter.play(mediaType);
    } else {
      System.out.println("Playing MP3");
    }
  }

}
