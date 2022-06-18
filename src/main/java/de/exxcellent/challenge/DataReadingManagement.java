package de.exxcellent.challenge;

import java.util.List;

/**
 * Class that uses the file extension to determine which protocol to use to read the file.
 */
public class DataReadingManagement {
    //region private properties
     private ReadingProtocol _readingProtocol;
    //endregion private properties

    //region public properties
    //endregion public properties

    //region private methods

    /**
     *Method in which the protocol is selected based on the file extension.
     * @param sFileExtension
     */
    private void ProtocolDetermination(String sFileExtension)
    {
        switch(sFileExtension)
        {
            case "csv":
            {
                this._readingProtocol = new CSVReadingProtocol();
                break;
            }
            default:
            {
                break;
            }
        }
    }
    //endregion private methods

    //region  public methods

    /**
     * Start method of the class for reading in the data
     * @param sFileName
     * @return The read data
     */
    public List<List<String>> ReadData(String sFileName) {
        List<List<String>> sResults;
        String sFileExtension = sFileName.split("\\.")[1];

        this.ProtocolDetermination(sFileExtension);
        sResults = this._readingProtocol.ReadingFile(sFileName);

        return sResults;
    }
    //endregion public methods
}
