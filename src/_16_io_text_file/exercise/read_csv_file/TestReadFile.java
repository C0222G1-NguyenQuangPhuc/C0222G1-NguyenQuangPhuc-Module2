package _16_io_text_file.exercise.read_csv_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestReadFile {
    public static List<Country> myList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        display();
    }

    public static void display() throws IOException {
        List<String[]> listCountries = ReadFile.readFile("src/_16_io_text_file/exercise/read_csv_file/countries.csv");
        for (String[] item : listCountries) {
            Country country = new Country(Integer.parseInt(item[0]),item[1],item[2]);
            myList.add(country);
        }

        for (Country item : myList ) {
            System.out.println(item.toString());
        }
    }
}
