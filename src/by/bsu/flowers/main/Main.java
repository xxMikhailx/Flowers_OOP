package by.bsu.flowers.main;

import by.bsu.flowers.creator.Creator;
import by.bsu.flowers.report.Report;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by Михаил on 23.11.2015.
 */
public class Main {

    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }

    public static Creator creator = new Creator();

    private static Logger LOG = Logger.getLogger(Main.class);


    public static void main(String[] args) {
        creator.createObjects();
        Report.reportCutFlowerList();
        Report.reportGardenFlowerList();
        Report.reportMeadowFlowerList();
        Report.reportAccessoryList();
        creator.createBouquet1();
        Report.reportUnsortBouquetList();
        Report.reportSortBouquetList();
        Report.reportSearchList();
        Report.reportTotalBouquetPrice();
        LOG.debug("End of running.");
    }

}
