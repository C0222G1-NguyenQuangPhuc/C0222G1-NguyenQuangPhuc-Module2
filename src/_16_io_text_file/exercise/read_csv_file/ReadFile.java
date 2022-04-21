package _16_io_text_file.exercise.read_csv_file;

import _16_io_text_file.exercise.copy_file_text.ReaderAndWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {


    public static List<String[]> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> myList = new ArrayList<>();
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {
                String[] arrStr = line.split(",");
                myList.add(arrStr);
            }
            return myList;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }
}
