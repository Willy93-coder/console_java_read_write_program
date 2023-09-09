import java.io.FileWriter;
import java.io.IOException;

public class MyWriter {

    public void createFile(String file) throws IOException {
        FileWriter writeToFile = new FileWriter(file);
        writeToFile.write("");
        writeToFile.close();
    }

    public void writer(String file, String text) throws IOException {
        FileWriter writeToFile = new FileWriter(file, true);
        writeToFile.write(text);
        writeToFile.close();
    }

    public void deleteContent(String file) throws IOException {
        FileWriter writeToFile = new FileWriter(file);
        writeToFile.write("");
        writeToFile.close();
    }
}
