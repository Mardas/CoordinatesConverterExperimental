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

    public String[][] read (String inputPath){

        List<String> list_of_coordinates = new ArrayList<>();
        String line = "";
        try  (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputPath))){
            while ((line = bufferedReader.readLine()) !=null){
                list_of_coordinates.add(line);
            }

        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        //====to poniżej można by chyba wrzucić do parsera=====
        String[] table_of_readLine;
        String[][] table_of_coordinates = new String[list_of_coordinates.size()][2];
        //int counter = 0;
        for(int i=0; i<list_of_coordinates.size(); i++){
            table_of_readLine = list_of_coordinates.get(i).split(";");

            table_of_coordinates[i][0] = table_of_readLine[0];
            table_of_coordinates[i][1] = table_of_readLine[1];
            //counter++;
        }

        return table_of_coordinates;
    }
}
