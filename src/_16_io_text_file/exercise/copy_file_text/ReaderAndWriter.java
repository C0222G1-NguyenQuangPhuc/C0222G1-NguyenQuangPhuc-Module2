package _16_io_text_file.exercise.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    public List<String> readFile(String path) {
        List<String> myList = new ArrayList<>();
        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                myList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Source file is not exist or Target File is exist!");
        }
        return myList;
    }

    public void writeFile(String targetFile, String line) {
        try {
            FileWriter writer = new FileWriter(targetFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
