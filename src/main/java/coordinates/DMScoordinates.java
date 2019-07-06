package coordinates;

public class DMScoordinates {
    DMSlatitude dmsLatitude;
    DMSlongitude dmsLongitude;


    DMScoordinates (DMSlatitude dmsLatitude, DMSlongitude dmsLongitude){
        this.dmsLatitude = dmsLatitude;
        this.dmsLongitude = dmsLongitude;
    }

    public DMSlongitude setDMSlongitude (Integer d, Integer m, Double s){
        DMSlongitudeBuilder dmsLongitudeBuilder = new DMSlongitudeBuilder();
        DMSlongitude dmsLongitude = dmsLongitudeBuilder.degrees(d).minutes(m).seconds(s).buildDMSlongitude();
        return dmsLongitude;
    }

    public DMSlatitude setDMSlatitude (Integer d, Integer m, Double s) {
        DMSlatitudeBuilder dmsLatitudebuilder = new DMSlatitudeBuilder();
        DMSlatitude dmsLatitude = dmsLatitudebuilder.degrees(d).minutes(m).seconds(s).builldDMSlatitude();
        return dmsLatitude;
    }
    //TODO doda metodę, która przyjuje w parametrach wartości DMS dla longitude i latitude i zwraca współrzędne
    //TODO doda metodę wyświetlajacą współrzędne jako String




}
