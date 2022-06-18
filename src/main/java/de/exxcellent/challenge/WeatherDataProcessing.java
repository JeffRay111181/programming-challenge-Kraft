package de.exxcellent.challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class for processing the weather datas
 */
public class WeatherDataProcessing extends DataProcessing{
    /**
     * Abstract method for processing the data
     * @param sDates A list of the data read
     * @return found entry based on the smallest difference
     */
    @Override
    public String DataProcessing(List<List<String>> sDates) {

        HashMap<String, Integer> mapDayDiffTemp = new HashMap<>();
        Map.Entry<String, Integer> minValueEntry = null;
        try {
            for (List<String> sDate : sDates) {
                try {
                    mapDayDiffTemp.put(sDate.get(0), Integer.parseInt(sDate.get(1)) - Integer.parseInt(sDate.get(2)));
                }
                catch(NumberFormatException ex)
                {
                    continue;
                }
            }

            minValueEntry = mapDayDiffTemp.entrySet()
                    .stream()
                    .min(Map.Entry.comparingByValue()).get();

            System.out.printf("Smallest temperature spread: %s\n", minValueEntry.getValue());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return minValueEntry.getKey();
    }
//region private proberties
//endregion private proberties

//region public proberties
//endregion public proberties

//region private methods
//endregion private methods

//region public methods
//endregion public methods
}
