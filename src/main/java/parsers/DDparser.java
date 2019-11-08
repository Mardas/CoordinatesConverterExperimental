package parsers;



import coordinates.DDCoordinates;
import coordinates.DMScoordinates;

import java.util.ArrayList;
import java.util.List;

public class DDparser {
    public List<DDCoordinates> parseDDcoordinates (String[][] table_of_coordinates) {

        Double latitude;
        Double longitude;

        List<DDCoordinates> ddCoordinatesList = new ArrayList<>();
        for (int row = 0; row < table_of_coordinates.length; row++) {
            if(table_of_coordinates[row][0].equals("") && table_of_coordinates[row][1].equals("")){
                latitude = null;
                longitude = null;
            }else {
                latitude = Double.parseDouble(table_of_coordinates[row][0]);
                longitude = Double.parseDouble(table_of_coordinates[row][1]);
            }


            DDCoordinates ddCoordinates = new DDCoordinates();

            ddCoordinates.setLatitude(latitude);
            ddCoordinates.setLongitude(longitude);

            ddCoordinatesList.add(ddCoordinates);
        }

        return ddCoordinatesList;

    }
}
