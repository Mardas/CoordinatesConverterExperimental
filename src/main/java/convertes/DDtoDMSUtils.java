package convertes;

import calculators.DDtoDMScalculator;
import coordinates.DDCoordinates;
import coordinates.DMScoordinates;
import fileReader.CSV_FileReader;
import listsConverters.ListToTable;
import parsers.DDparser;

import java.util.List;

public class DDtoDMSUtils {
    public List<DMScoordinates> ddToDMSutils (String inputPath){

        CSV_FileReader csv_fileReader = new CSV_FileReader();
        List<String> list_of_coordinates = csv_fileReader.read(inputPath);

        ListToTable listToTable = new ListToTable();
        String[][] table_of_coordinates = listToTable.convertToTable(list_of_coordinates);

        DDparser ddParser = new DDparser();
        List<DDCoordinates> list_of_DDCoordinates = ddParser.parseDDcoordinates(table_of_coordinates);

//      List<DDCoordinates> list_of_DDCoordinates = ddParser
//              .parseDDcoordinates(listToTable.convertToTable(csv_fileReader.read(inputPath))); //alteratywa

        DDtoDMScalculator ddToDMScalculator = new DDtoDMScalculator();
        List<DMScoordinates> list_ofDMScoordinates = ddToDMScalculator
                .calculateDDtoDMScoordinates(list_of_DDCoordinates);

        return list_ofDMScoordinates;
    }
}
