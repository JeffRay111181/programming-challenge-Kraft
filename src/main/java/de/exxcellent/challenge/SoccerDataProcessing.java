package de.exxcellent.challenge;

import java.util.*;

/**
 * Class for processing the football datas
 */
public class SoccerDataProcessing extends DataProcessing{

//region private properties
//endregion private properties

//region public properties
@Override
public String DataProcessing(List<List<String>> sDates) {
    /**
     * Abstract method for processing the data
     * @param sDates A list of the data read
     * @return found entry based on the smallest difference
     */
    HashMap<String, Integer> mapDayDiffTemp = new HashMap<>();
    Map.Entry<String, Integer> minValueEntry = null;
    try {
        for (List<String> sDate : sDates) {
            try {
                mapDayDiffTemp.put(sDate.get(0), Math.abs(Integer.parseInt(sDate.get(5)) - Integer.parseInt(sDate.get(6))));
            }
            catch(NumberFormatException ex)
            {
                continue;
            }

        }

        minValueEntry = mapDayDiffTemp.entrySet()
                .stream()
                .min(Map.Entry.comparingByValue()).get();

        System.out.printf("Smallest goal spread: %s\n", minValueEntry.getValue());
    } catch (Exception ex) {
        System.out.println(ex.getMessage());
    }
    return minValueEntry.getKey();
}
//endregion public properties

//region private methods
//endregion private methods

//region public methods
//endregion public methods
}
