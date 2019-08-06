package converting_tools;

import convertes.DDtoDMSconverter;
import convertes.DMStoDDconverter;


public class ConverterFactory {

    public Converter produce (CoordinatesFormat coordinatesFormat){
        if(CoordinatesFormat.DMStoDD.equals(coordinatesFormat)){
            return new DMStoDDconverter();
        }
        if(CoordinatesFormat.DDtoDMS.equals(coordinatesFormat)){
            return new DDtoDMSconverter();
        }
        return null;
    }
}
