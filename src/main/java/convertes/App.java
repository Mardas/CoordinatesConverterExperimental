package convertes;

import converting_tools.CoordinatesFormat;
import coordinates.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws FileNotFoundException {


        String inputPath = "/Users/joannamardas/coordinates/DDcoordinates.txt";
        String outputhPath = "/Users/joannamardas/coordinates/DMScoordinates.txt";

        String inputPath2 = "/Users/joannamardas/coordinates/DMScoordinates.txt";
        String outputPath2 = "/Users/joannamardas/coordinates/DDcoordinates2.txt";

        CoordinatesConventer coordinatesConventer = new CoordinatesConventer();
        coordinatesConventer.convertCoordinates(inputPath, outputhPath, CoordinatesFormat.DDtoDMS);

        coordinatesConventer.convertCoordinates(inputPath2, outputPath2, CoordinatesFormat.DMStoDD);

    }
}
