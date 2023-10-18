package structural.facade.medialib;

public class VideoConverter implements MediaConverter {

	@Override
	public String convert(String fileName, String format) {
		System.out.println(fileName + " is converted to audio in format: " + format);
		return fileName;
	}
}
