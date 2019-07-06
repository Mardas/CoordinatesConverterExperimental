package coordinates;

public class DMSlatitudeBuilder {
    public DMSlatitude dmsLatitude;

    public DMSlatitudeBuilder(){
        dmsLatitude = new DMSlatitude();
    }

    public DMSlatitudeBuilder degrees (Integer d){
        dmsLatitude.setDegrees(d);
        return this;
    }

    public DMSlatitudeBuilder minutes (Integer m){
        dmsLatitude.setMinutes(m);
        return this;
    }

    public DMSlatitudeBuilder seconds(Double s){
        dmsLatitude.setSeconds(s);
        return this;
    }

    public DMSlatitude builldDMSlatitude(){
        return dmsLatitude;
    }
}
