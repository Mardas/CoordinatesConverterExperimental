package coordinates;

public class DMScoordinates {

    DMSlatitude dmsLatitude;
    DMSlongitude dmsLongitude;


    DMScoordinates (DMSlatitude dmsLatitude, DMSlongitude dmsLongitude){
        this.dmsLatitude = dmsLatitude;
        this.dmsLongitude = dmsLongitude;
    }

    public DMSlatitude getDmsLatitude() {
        return dmsLatitude;
    }

    public DMSlongitude getDmsLongitude() {
        return dmsLongitude;
    }

    @Override
    public String toString(){
        return this.dmsLatitude.getDegrees() + " "+ this.dmsLatitude.getMinutes() + " " + this.dmsLatitude.getSeconds() + ";"
                + this.dmsLongitude.getDegrees() + " " + this.dmsLongitude.getMinutes() + " " + this.dmsLongitude.getSeconds();
    }

}
