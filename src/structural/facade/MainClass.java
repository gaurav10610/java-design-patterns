package structural.facade;

public class MainClass {

	public static void main(String[] args) {

		String fileName = "MyVideo.mp4";
		String targetAudioFormat = "mp3";

		MediaLibInterface mediaLibFacadeInstance = new MediaLibFacade();
		mediaLibFacadeInstance.convertVideoToAudio(fileName, targetAudioFormat);
	}
}
