package by.bsu.flowers.report;

import by.bsu.flowers.actions.SearchByLength;
import by.bsu.flowers.actions.SortByFreshness;
import by.bsu.flowers.creator.Creator;
import by.bsu.flowers.entity.Accessory;
import by.bsu.flowers.entity.CutFlower;
import by.bsu.flowers.exception.FlowerException;
import by.bsu.flowers.main.Main;
import org.apache.log4j.Logger;

/**
 * Created by Михаил on 25.11.2015.
 */
public class Report {

    private static Logger LOG = Logger.getLogger(Report.class);

    public static void reportCutFlowerList(){
        System.out.println("******************************************");
        System.out.println("            List of Cut Flowers:          ");
        System.out.println("******************************************");
        System.out.println(Creator.rose1 + "\n" + Creator.rose2 + "\n" + Creator.rose3 + "\n" + Creator.rose4 + "\n" + Creator.tulip1 + "\n" + Creator.tulip2 + "\n" + Creator.lilium1 + "\n" + Creator.lilium2 + "\n" + Creator.lilium3);
    }

    public static void reportGardenFlowerList(){
        System.out.println("******************************************");
        System.out.println("          List of Garden Flowers:          ");
        System.out.println("******************************************");
        System.out.println(Creator.thoren + "\n" + Creator.kermek + "\n" + Creator.kereopsis);
    }

    public static void reportMeadowFlowerList(){
        System.out.println("******************************************");
        System.out.println("           List Meadow Flowers:           ");
        System.out.println("******************************************");
        System.out.println(Creator.aconite + "\n" + Creator.cornflower + "\n" + Creator.lupine);
    }

    public static void reportAccessoryList(){
        System.out.println("******************************************");
        System.out.println("            List of Accessories:            ");
        System.out.println("******************************************");
        System.out.println(Creator.ribbon + "\n" + Creator.ribbon2 + "\n" + Creator.cover);
    }

    public static void reportUnsortBouquetList(){
        System.out.println("******************************************");
        System.out.println("              No Sort Bouquet:            ");
        System.out.println("******************************************");
        System.out.println(Creator.bouquet);
    }

    public static void reportSortBouquetList(){
        System.out.println("******************************************");
        System.out.println("          Sort by Length Bouquet:          ");
        System.out.println("******************************************");
        try {
            for (CutFlower cf: SortByFreshness.sortByFreshness(Main.creator.bouquet.getBouquetFlowers())) {
                System.out.println(cf);
            }
        } catch (FlowerException e) {
            e.printStackTrace();
        }
        for (Accessory cf: Main.creator.bouquet.getBouquetAccessories()) {
            System.out.println(cf);
        }
    }

    public static void reportSearchList(){
        System.out.println("******************************************");
        System.out.println("             Searched Flowers:             ");
        System.out.println("              Range: " + SearchByLength.MINIMAL_RANGE_VALUE + " - " + SearchByLength.MAXIMAL_RANGE_VALUE);
        System.out.println("******************************************");
        try {
            for (CutFlower cf: SearchByLength.searchByLength(SearchByLength.MINIMAL_RANGE_VALUE, SearchByLength.MAXIMAL_RANGE_VALUE,Main.creator.bouquet.getBouquetFlowers())) {
                System.out.println(cf);
            }
        } catch (FlowerException e) {
            e.printStackTrace();
        }
    }

    public static void reportTotalBouquetPrice(){
        System.out.println("******************************************");
        System.out.println("             Total price of Bouquet:            ");
        System.out.println("                    " + Creator.bouquet.calculateTotalPrice());
        System.out.println("******************************************");
    }

}
