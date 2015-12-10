package by.bsu.flowers.actions;

import by.bsu.flowers.entity.CutFlower;
import by.bsu.flowers.exception.FlowerException;
import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by Михаил on 24.11.2015.
 */
public final class SearchByLength {

    private static Logger LOG = Logger.getLogger(SearchByLength.class);

    public static final int MINIMAL_RANGE_VALUE = 50;
    public static final int MAXIMAL_RANGE_VALUE = 80;

    private SearchByLength() {
    }

    public static ArrayList<CutFlower> searchByLength(int min, int max, ArrayList<CutFlower> bouquetFlowers) throws FlowerException {
        if (bouquetFlowers.isEmpty()){
            throw new FlowerException("Bouquet of flowers can not be empty for search.");
        }
        ArrayList<CutFlower> searchResultList = new ArrayList<CutFlower>();

        for (CutFlower cf : bouquetFlowers) {
            if (cf.getLength() >= min && cf.getLength() <= max){
                LOG.debug("foreach " + cf);
                searchResultList.add(cf);
            }
        }

        return searchResultList;
    }

}
