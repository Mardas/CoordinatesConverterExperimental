package coordinates;

public class DDCoordinates {


    private Double latitude;
    private Double longitude;

    public DDCoordinates(){};

//    DDCoordinates(Double latitude, Double longitude){
//        this.latitude = latitude;
//        this.longitude = longitude;
//    }



    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "DDCoordinates{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}

