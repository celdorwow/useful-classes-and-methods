import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourcesReader {
    // Usage:
    //
    //        BufferedReader rr = getReader("file.csv");
    //        if (rr != null) {
    //            rr.lines()
    //                .map(e -> String.join(" ::: ", e.split(",")))
    //                .forEach(System.out::println);
    //        }

    public static <T> BufferedReader getReader(String fileName, Class<T> type) throws FileNotFoundException {
        InputStream is = type.getClassLoader().getResourceAsStream(fileName);
        if (is == null) throw new FileNotFoundException("Error: " + fileName);
        return new BufferedReader(new InputStreamReader(is));
    }
}
