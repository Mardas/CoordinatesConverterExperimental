package convertes;

import converting_tools.Converter;
import converting_tools.ConverterFactory;
import converting_tools.CoordinatesFormat;

import java.io.FileNotFoundException;

public class CoordinatesConventer {
    public void convertCoordinates (String inputPath, String outputPath, CoordinatesFormat coordinatesFormat) throws FileNotFoundException {
        ConverterFactory converterFactory = new ConverterFactory();
        Converter converter = converterFactory.produce(coordinatesFormat);
        converter.convert(inputPath, outputPath);

    }
}
