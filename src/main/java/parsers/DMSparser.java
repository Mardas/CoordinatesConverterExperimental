package parsers;

import coordinates.DMScoordinates;
import coordinates.DMSutils;

import java.util.ArrayList;
import java.util.List;

public class DMSparser {

    public List<DMScoordinates> parseDMScoordinates (String[][] table_of_coordinates){
        Integer dLatitude;
        Integer mLatitude;
        Double sLatitude;

        Integer dLongitude;
        Integer mLongitude;
        Double sLongitude;

        List<DMScoordinates> dmsCoordinatesList = new ArrayList<>();
        for(int row = 0; row<table_of_coordinates.length; row++){
               String[] latitude = table_of_coordinates[row][0].split(" ");
               String[] longitude = table_of_coordinates[row][1].split(" ");

               dLatitude = Integer.parseInt(latitude[0]);
               mLatitude = Integer.parseInt(latitude[1]);
               sLatitude = Double.parseDouble(latitude[2]);

               dLongitude = Integer.parseInt(longitude[0]);
               mLongitude = Integer.parseInt(longitude[1]);
               sLongitude = Double.parseDouble(longitude[2]);

            DMSutils dmsUtils = new DMSutils();
            DMScoordinates dmsCoordinates = dmsUtils
                    .setDMScoordinates(dLatitude, mLatitude, sLatitude, dLongitude, mLongitude, sLongitude);
            dmsCoordinatesList.add(dmsCoordinates);
        }
        return dmsCoordinatesList;
    }
}
