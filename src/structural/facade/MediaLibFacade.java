package structural.facade;

import structural.facade.medialib.AudioConveter;
import structural.facade.medialib.MediaConverter;

public class MediaLibFacade implements MediaLibInterface {

	private MediaConverter mediaConverter;

	public MediaLibFacade() {
		this.mediaConverter = new AudioConveter();
	}

	@Override
	public String convertVideoToAudio(String fileName, String format) {
		System.out.println("converting video to audio using media lib facade");
		return mediaConverter.convert(fileName, format);
	}

}
