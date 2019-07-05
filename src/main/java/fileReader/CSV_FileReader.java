package fileReader;

import converting_tools.CoordinatesFormat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV_FileReader {
//    public List<String> read (String inputPath) throws FileNotFoundException {
//        List<String> list_of_coordinates = null;
//        //TODO read line by line
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath));
//        return list_of_coordinates;
//    }

    public List<String> read (String inputPath) {

        List<String> list_of_coordinates = new ArrayList<>();
        String line = "";
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))) {
            while ((line = bufferedReader.readLine()) != null) {
                list_of_coordinates.add(line);
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return list_of_coordinates;
    }

}
