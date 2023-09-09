import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MyReader {

    public void reader(String file) throws IOException {
        FileReader fileToRead = new FileReader(file);
        int letter = fileToRead.read();

        while (letter > -1) {
            System.out.println((char)letter);
            letter = fileToRead.read();
        }

        fileToRead.close();
    }
}
