package by.bsu.flowers.actions;

import by.bsu.flowers.entity.CutFlower;

import java.util.Comparator;

/**
 * Created by Михаил on 29.11.2015.
 */
public class FlowerFreshnessDescendingOrderComparator implements Comparator<CutFlower> {

    @Override
    public int compare(CutFlower o1, CutFlower o2) {

        int freshness1 = o1.getFreshness();
        int freshness2 = o2.getFreshness();

        if (freshness2 > freshness1){
            return 1;
        }

        else if (freshness2 < freshness1){
            return -1;
        }

        else {
            return 0;
        }
    }
}
