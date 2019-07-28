package convertes;

import coordinates.DDCoordinates;
import coordinates.DMScoordinates;
import fileReader.CSV_FileReader;
import listsConverters.ListToTable;
import parsers.DMSparser;

import java.util.List;

public class DMStoDDUtils {
    public List<DDCoordinates> dmsToDDutils (String inputPath){

        CSV_FileReader csv_fileReader = new CSV_FileReader();
        List<String> list_of_coordinates = csv_fileReader.read(inputPath);

        ListToTable listToTable = new ListToTable();
        String[][] table_of_coordinates = listToTable.convertToTable(list_of_coordinates);

        DMSparser dmsParser = new DMSparser();
        List<DMScoordinates> list_ofDMSCoordinates = dmsParser.parseDMScoordinates(table_of_coordinates);

        DMStoDDcalculator dmsToDDcalculator = new DMStoDDcalculator();
        List<DDCoordinates> list_ofDDcoordinates = dmsToDDcalculator
                .calculateDMStoDDcoordinates(list_ofDMSCoordinates);

        return list_ofDDcoordinates;

    }
}
