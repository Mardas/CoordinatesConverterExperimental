package coordinates;

public class DMSutils {
    public DMSlongitude setDMSlongitude (Integer dLongitude, Integer mLongitude, Double sLongitude){
        DMSlongitudeBuilder dmsLongitudeBuilder = new DMSlongitudeBuilder();
        DMSlongitude dmsLongitude = dmsLongitudeBuilder.degrees(dLongitude).minutes(mLongitude).seconds(sLongitude).buildDMSlongitude();
        return dmsLongitude;
    }

    public DMSlatitude setDMSlatitude (Integer dLatitude, Integer mLatitude, Double sLatitude) {
        DMSlatitudeBuilder dmsLatitudebuilder = new DMSlatitudeBuilder();
        DMSlatitude dmsLatitude = dmsLatitudebuilder.degrees(dLatitude).minutes(mLatitude).seconds(sLatitude).builldDMSlatitude();
        return dmsLatitude;
    }

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
