package converting_tools;



import java.io.FileNotFoundException;

public interface Converter {
    void convert(String inputPath, String outputPath)throws FileNotFoundException;
}
