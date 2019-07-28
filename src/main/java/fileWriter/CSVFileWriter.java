package fileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVFileWriter {

    public <T> void write (String outputhPath, List<T> list){

        StringBuffer valueBuilder = new StringBuffer();
        String coordinatesLine = new String();
        for(int i = 0; i < list.size(); i++){
            String coordinates = list.get(i).toString();
            valueBuilder.append(coordinates);
            coordinatesLine = valueBuilder.append("\n").toString();
        }

        String fileWithCoordinates = coordinatesLine;
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputhPath))) {
            bufferedWriter.write(fileWithCoordinates);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

