import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReader {
    // Usage:
    //
    //        BufferedReader rr = getReader("file.csv");
    //        if (rr != null) {
    //            rr.lines()
    //                .map(e -> String.join(" ::: ", e.split(",")))
    //                .forEach(System.out::println);
    //        }

    public static <T> BufferedReader getReader(String fileName, Class<T> type) throws IOException {
        InputStream is = type.getResourceAsStream(fileName);
        if (is == null) throw new IOException("Error: " + fileName);
        return new BufferedReader(new InputStreamReader(is));
    }
}
