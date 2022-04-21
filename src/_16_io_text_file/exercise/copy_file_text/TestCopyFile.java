package _16_io_text_file.exercise.copy_file_text;

import _16_io_text_file.exercise.read_csv_file.Country;
import _16_io_text_file.exercise.read_csv_file.ReadFile;

import java.util.ArrayList;
import java.util.List;

public class TestCopyFile {
    public static List<Country> myList = new ArrayList<>();

    public static void main(String[] args) {
        ReaderAndWriter readerAndWriter = new ReaderAndWriter();
        List<String> arrStr = readerAndWriter.readFile("src/_16_io_text_file/exercise/copy_file_text/source_file.txt");
        for (String item : arrStr) {
            readerAndWriter.writeFile("src/_16_io_text_file/exercise/copy_file_text/target_file.txt",item);
        }
    }
}
