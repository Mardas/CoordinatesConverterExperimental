package coordinates;

public class DDCoordinates {

    private Double longitude;
    private Double latitude;

    DDCoordinates(Double longitude, Double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

}
