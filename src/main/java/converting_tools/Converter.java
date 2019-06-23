package converting_tools;

import sun.rmi.rmic.iiop.ValueType;

public interface Converter {
    void convert(String inputPath, String outputPath, CoordinatesFormat coordinatesFormat);
}
