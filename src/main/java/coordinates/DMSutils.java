package coordinates;

public class DMSutils {


    public DMScoordinates setDMScoordinates (Integer dLatitude, Integer mLatitude, Double sLatitude, Integer dLongitude, Integer mLongitude, Double sLongitude){

        DMSlatitudeBuilder dmsLatitudebuilder = new DMSlatitudeBuilder();
        DMSlatitude dmsLatitude = dmsLatitudebuilder
                .degrees(dLatitude)
                .minutes(mLatitude)
                .seconds(sLatitude)
                .builldDMSlatitude();

        DMSlongitudeBuilder dmsLongitudeBuilder = new DMSlongitudeBuilder();
        DMSlongitude dmsLongitude = dmsLongitudeBuilder
                .degrees(dLongitude)
                .minutes(mLongitude)
                .seconds(sLongitude)
                .buildDMSlongitude();

        DMScoordinates dmsCoordinates = new DMScoordinates(dmsLatitude, dmsLongitude);

        return dmsCoordinates;
    }
}
