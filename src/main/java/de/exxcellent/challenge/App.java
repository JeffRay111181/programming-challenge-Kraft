package de.exxcellent.challenge;

import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …

        String[] sDataBaseNames = args[0].split(",");
        String sResult;

        for (String sDataBaseName: sDataBaseNames)
        {
            switch(sDataBaseName)
            {
                case "weather.csv":
                {
                    WeatherDataProcessing weatherDataProcessing = new WeatherDataProcessing();
                    sResult = weatherDataProcessing.StartDataProcessing(sDataBaseName);

                    String dayWithSmallestTempSpread = sResult;     // Your day analysis function call …
                    System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);
                    break;
                }
                case "football.csv":
                {
                    SoccerDataProcessing soccerDataProcessing = new SoccerDataProcessing();
                    sResult = soccerDataProcessing.StartDataProcessing(sDataBaseName);

                    String teamWithSmallestGoalSpread = sResult; // Your goal analysis function call …
                    System.out.printf("Team with smallest goal spread : %s%n", teamWithSmallestGoalSpread);
                    break;
                }
                default: {
                    System.out.println("This data base can not be processed!");
                    break;
                }
            }
        }
    }
}
