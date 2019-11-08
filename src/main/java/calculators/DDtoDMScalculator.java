package calculators;

import coordinates.DDCoordinates;
import coordinates.DMScoordinates;
import coordinates.DMSutils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class DDtoDMScalculator {
    public List<DMScoordinates> calculateDDtoDMScoordinates(List<DDCoordinates> list_of_DDCoordinates){

        List<DMScoordinates> dmsCoordinatesList = new ArrayList<>();

        for (int i = 0; i < list_of_DDCoordinates.size(); i++){
            Double latitude = list_of_DDCoordinates.get(i).getLatitude();
            Double longitude = list_of_DDCoordinates.get(i).getLongitude();

            Integer dLatitude = latitude.intValue();

            Double minutesLatitude = (latitude%latitude.intValue())*60;
            Integer mLatitude = minutesLatitude.intValue();

            Double sLatitude = (minutesLatitude%minutesLatitude.intValue())*60;

            Integer dLongitude = longitude.intValue();

            Double minutesLongitude = (longitude%longitude.intValue())*60;
            Integer mLongitude = minutesLongitude.intValue();

            Double sLongitude = (minutesLongitude%minutesLongitude.intValue())*60;


            DMSutils dmsUtils = new DMSutils();
            DMScoordinates dmsCoordinates = dmsUtils
                    .setDMScoordinates(dLatitude, mLatitude, sLatitude, dLongitude, mLongitude, sLongitude);
            dmsCoordinatesList.add(dmsCoordinates);
        }
        return dmsCoordinatesList;
    }
    private static Double round(Double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
