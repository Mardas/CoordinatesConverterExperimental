package fileReader;

import coordinates.DMScoordinates;
import coordinates.DMSutils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

        String[][] table_of_coordinates2 = new String[2][2];
        table_of_coordinates2[0][0] = "36 52 20.51";
        table_of_coordinates2[0][1] = "41 1 17.51";
        table_of_coordinates2[1][0] = "37 45 26.41";
        table_of_coordinates2[1][1] = "42 18 23.01";
        List<DMScoordinates> dmsCoordinatesList = new ArrayList<>();
        for(int row = 0; row<table_of_coordinates2.length; row++){
            String[] latitude = table_of_coordinates2[row][0].split(" ");
            String[] longitude = table_of_coordinates2[row][1].split(" ");

            System.out.println(latitude[0] + " " + latitude[1] + " " + latitude[2]);
            System.out.println(longitude[0] + " " + longitude[1] + " " + longitude[2]);

            Integer dLatitude = Integer.parseInt(latitude[0]);
            Integer mLatitude = Integer.parseInt(latitude[1]);
            Double sLatitude = Double.parseDouble(latitude[2]);

            Integer dLongitude = Integer.parseInt(longitude[0]);
            Integer mLongitude = Integer.parseInt(longitude[1]);
            Double sLongitude = Double.parseDouble(longitude[2]);

            DMSutils dmsUtils = new DMSutils();
            DMScoordinates dmsCoordinates = dmsUtils
                    .setDMScoordinates(dLatitude, mLatitude, sLatitude, dLongitude, mLongitude, sLongitude);
            dmsCoordinatesList.add(dmsCoordinates);
        }
        System.out.println(dmsCoordinatesList.toString());
        System.out.println(Arrays.asList(dmsCoordinatesList));
        System.out.println(dmsCoordinatesList.get(0));
        System.out.println(dmsCoordinatesList.get(1));
        System.out.println(dmsCoordinatesList.get(1).getDmsLatitude().getDegrees());


}
}
