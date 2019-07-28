package convertes;

import converting_tools.Converter;
import converting_tools.ConverterFactory;
import converting_tools.CoordinatesFormat;
import coordinates.DDCoordinates;
import coordinates.DMScoordinates;
import coordinates.DMSutils;
import fileReader.CSV_FileReader;
import listsConverters.ListToTable;
import parsers.DDparser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class DDtoDMSconverter implements Converter {
    @Override
    public void convert(String inputPath, String outputPath) throws FileNotFoundException {
        //TODO zapis do pliku


       DDtoDMSUtils dDtoDMSUtils = new DDtoDMSUtils();
       List<DMScoordinates> list_of_DMScoordinates = dDtoDMSUtils.ddToDMSutils(inputPath, outputPath);



    }
}
