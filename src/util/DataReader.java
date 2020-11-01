package util;

import java.io.*;
import java.util.stream.Collectors;

/**
 * @author Nikolay Sinitsin
 */
public class DataReader {

    public String readData(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            return reader.lines().collect(Collectors.joining());

        } catch (IOException ignored) {
            System.err.println("File not found");
        }
        return null;
    }
}
