package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReadingProtocol implements ReadingProtocol {
    @Override
    public List<List<String>> ReadingFile(String sFileName) {
        List<List<String>> records = new ArrayList<>();

        try {

            InputStream inputStream = this.getClass().getResourceAsStream("/" + sFileName);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return records;
    }
//region private properties
//endregion private properties

//region public properties
//endregion public properties

//region private methods
//endregion private methods

//region public methods
//endregion public methods
}
