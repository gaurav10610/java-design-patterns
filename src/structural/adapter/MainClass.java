package structural.adapter;

public class MainClass {

  public static void main(String[] args) {
   MediaPlayer mediaPlayer = new AudioPlayer();
   mediaPlayer.play("VLC");
   mediaPlayer.play("MP3");
  }

}
