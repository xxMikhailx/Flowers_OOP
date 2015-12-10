package by.bsu.flowers.actions;

import by.bsu.flowers.entity.CutFlower;
import by.bsu.flowers.exception.FlowerException;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Михаил on 25.11.2015.
 */
public final class SortByFreshness {

    private static Logger LOG = Logger.getLogger(SortByFreshness.class);

    private SortByFreshness() {
    }

    public static ArrayList<CutFlower> sortByFreshness(ArrayList<CutFlower> bouquetFlowers) throws FlowerException {
        if (bouquetFlowers.isEmpty()){
            throw new FlowerException("Bouquet of flowers can not be empty for sort.");
        }

        Collections.sort(bouquetFlowers, new FlowerFreshnessDescendingOrderComparator());

        return bouquetFlowers;
    }

}
