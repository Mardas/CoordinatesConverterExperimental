//package convertes;
//
//import converting_tools.CoordinatesFormat;
//import coordinates.*;
//
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class App {
//    public static void main(String[] args) throws FileNotFoundException {

//        DMSlatitudeBuilder dmSlatitudeBuilder = new DMSlatitudeBuilder();
//        DMSlatitude dmSlatitude= dmSlatitudeBuilder.degrees(null).minutes(null).seconds(null).builldDMSlatitude();
//        DMSlongitudeBuilder dmSlongitudeBuilder = new DMSlongitudeBuilder();
//        DMSlongitude dmSlongitude = dmSlongitudeBuilder.degrees(null).minutes(null).seconds(null).buildDMSlongitude();
        //DMScoordinates dmsCoordinates = new DMScoordinates(dmSlatitude, dmSlongitude);
//
//        DMSutils dmsUtils = new DMSutils();
//        DMScoordinates dmsCoordinates = dmsUtils
//                .setDMScoordinates(null, null, null, null, null, null);
//        System.out.println(dmsCoordinates.toString());
//    }

//        String inputPath = "/Users/joannamardas/coordinates/DDcoordinates.txt";
//        String outputhPath = "/Users/joannamardas/coordinates/DMScoordinates.txt";
//
//        String inputPath2 = "/Users/joannamardas/coordinates/DMScoordinates.txt";
//        String outputPath2 = "/Users/joannamardas/coordinates/DDcoordinates2.txt";
//
//        CoordinatesConventer coordinatesConventer = new CoordinatesConventer();
//        coordinatesConventer.convertCoordinates(inputPath, outputhPath, CoordinatesFormat.DDtoDMS);
//
//        coordinatesConventer.convertCoordinates(inputPath2, outputPath2, CoordinatesFormat.DMStoDD);
//
//    }


//}
