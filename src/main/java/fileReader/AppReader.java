package fileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppReader {
    public static void main(String[] args) {

    String inputPath = "/Users/joannamardas/Asia/alfabet.txt";
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
    String[] table_of_readLine;
    String[][] table_of_coordinates = new String[list_of_coordinates.size()][2];
    //int counter = 0;
        for(int i=0; i<list_of_coordinates.size(); i++){
                table_of_readLine = list_of_coordinates.get(i).split(";");

                table_of_coordinates[i][0] = table_of_readLine[0];
                table_of_coordinates[i][1] = table_of_readLine[1];
            //counter++;
            }


    //System.out.println(counter);
        System.out.println("lista" + list_of_coordinates.toString());
        System.out.println("tab 0 0: " + table_of_coordinates[0][0]+"," + "tab 0 1: " + table_of_coordinates[0][1]);
        System.out.println("tab 4 0: " + table_of_coordinates[4][0]+"," + "tab 4 1: " + table_of_coordinates[4][1]);

}
}
