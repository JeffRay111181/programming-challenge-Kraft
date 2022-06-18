package de.exxcellent.challenge;

import java.util.List;

public abstract class DataProcessing {

    //region private properties
    private DataReadingManagement dataReadingManagement = new DataReadingManagement();
    private List<List<String>> sDates;
    //endregion private properties

    //region public properties
    //endregion public properties

    //region private methods
    /**
     * Abstract method for processing the data
     * @param sDates A list of the data read
     */
    public abstract String DataProcessing(List<List<String>> sDates);
    //endregion private methods

    //region public methods

    /**
     * Start method for processing the data
     * @param sFileName Filename containing the data
     * @return The result of the processing
     */
    public String StartDataProcessing(String sFileName)
    {
        this.sDates = this.dataReadingManagement.ReadData(sFileName);
        String sResult = this.DataProcessing(this.sDates);
        return sResult;
    }
    //endregion public methods

}
