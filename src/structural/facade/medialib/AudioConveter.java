package structural.facade.medialib;

public class AudioConveter implements MediaConverter {

	@Override
	public String convert(String fileName, String format) {
		System.out.println(fileName + " is converted to audio in format: " + format);
		return fileName;
	}
}
