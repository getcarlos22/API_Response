package test.java.com.api;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataProviderTestNG {

    public static List<String> readFile(BufferedReader reader) throws IOException {

        List<String> readAllLines = new ArrayList<String>();
        String line = null;
        while((line = reader.readLine())!=null) {
            readAllLines.add(line);
        }
        return readAllLines;
    }

    @DataProvider(name = "requestURL")
    public static Object[][] requestURL() throws Exception {
        Object[][] request = null;
        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("./Files/file1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("./Files/file2.txt"));

            List<String> file1 = readFile(reader1);
            List<String> file2 = readFile(reader2);

            request = new Object[file1.size()][2];

            for (int i = 0; i < file1.size(); i++) {
                request[i][0] = file1.get(i);
                request[i][1] = file2.get(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return request;
    }

}
