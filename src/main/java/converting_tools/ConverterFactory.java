package converting_tools;

import convertes.DDtoDMSconverter;
import convertes.DMStoDDconverter;
import sun.rmi.rmic.iiop.ValueType;

public class ConverterFactory {

    public Converter produce (CoordinatesFormat coordinatesFormat){
        if(CoordinatesFormat.DMStoDD.equals(coordinatesFormat)){
            return new DMStoDDconverter();
        }
        if(CoordinatesFormat.DMtoDMS.equals(coordinatesFormat)){
            return new DDtoDMSconverter();
        }
        return null;
    }
}
