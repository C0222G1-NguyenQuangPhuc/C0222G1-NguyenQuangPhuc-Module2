package _16_io_text_file.practice.find_max_value;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> arrNums = readAndWriteFile.readFile("src/_16_io_text_file/practice/find_max_value/numbers");
        int maxValue = findMax(arrNums);
        readAndWriteFile.writeFile("src/_16_io_text_file/practice/find_max_value/result", maxValue);
    }

    public List<Integer> readFile(String path) {
        List<Integer> myList = new ArrayList<>();
        try {
            File file = new File(path);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                myList.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("File is not exist or error content!");
        }
        return myList;
    }

    public void writeFile(String path, int max) {
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Max = " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size() ; i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }
}
