import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test {

    public static final String URL = "test.txt";


    public static void main(String[] args) throws IOException {

        String[] read = FileService.read(URL);
        Student [] convert = StudentService.convert(read);
        Student student = StudentService.maxByMark(convert);
        FileService.write(URL ,"\nmax = " + student.toString());
        String s =  StudentService.sortByMaark(convert);
        FileService.write(URL , "\nShort By Mark"+s);
         StudentService.sortByName(convert);
        for (int i = 0; i < convert.length ; i++) {
            System.out.println(convert[i]);
        }


    }
}
