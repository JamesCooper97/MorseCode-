import java.io.File;
import java.io.IOException;

public class WavFile {
	private File file;						// read or write file
	private final static int BUFFER_SIZE = 4096;
	private byte[] buffer;
	
	private WavFile() {
		buffer = new byte[BUFFER_SIZE];
	}
	
	
	public static WavFile openWavFile(File file) throws IOException, WavFileException {
		WavFile wavFile = new WavFile(file);
		wavFile.file = file;
		
		
	}
	
	private long readSample() throws IOException, WavFileException {
		
	}
	
	
}
