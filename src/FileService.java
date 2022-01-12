import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {

    static String[] read(String path) throws IOException {
       return   Files.readAllLines(Paths.get(path)).toArray(new String[0]);
    }

    static void write(String path , String text) throws IOException {

        Files.write(Paths.get(path),text.getBytes(), StandardOpenOption.APPEND);

    }
}
