package coordinates;

public class AppCoordinates {
    public static void main(String[] args) {
        DMSutils dmsUtils = new DMSutils();
        DMScoordinates dmsCoordinates = dmsUtils.setDMScoordinates(36, 52, 20.51, 41, 01, 17.61);

        Integer degreesLat = dmsCoordinates.getDmsLatitude().getDegrees();
        System.out.println(degreesLat);
        System.out.println(dmsCoordinates.toString());

    }

}
