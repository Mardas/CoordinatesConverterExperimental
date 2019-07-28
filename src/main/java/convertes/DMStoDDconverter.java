package convertes;

import converting_tools.Converter;
import converting_tools.CoordinatesFormat;
import coordinates.DDCoordinates;
import fileWriter.CSVFileWriter;

import java.util.List;

public class DMStoDDconverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) {

        DMStoDDUtils dmsToDDutils = new DMStoDDUtils();
        List<DDCoordinates> list_ofDDcoordinates = dmsToDDutils.dmsToDDutils(inputPath);

        CSVFileWriter csvFileWriter = new CSVFileWriter();
        csvFileWriter.write(outputPath,list_ofDDcoordinates);

    }
}
