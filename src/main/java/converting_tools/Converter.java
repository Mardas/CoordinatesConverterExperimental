package converting_tools;

import sun.rmi.rmic.iiop.ValueType;

import java.io.FileNotFoundException;

public interface Converter {
    void convert(String inputPath, String outputPath)throws FileNotFoundException;
}
