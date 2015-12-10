package by.bsu.flowers.utility;

import org.apache.log4j.Logger;

/**
 * Created by Михаил on 25.11.2015.
 */
public final class IdGenerator {

    private static Logger LOG = Logger.getLogger(IdGenerator.class);

    private static int idFlower = 0;
    private static int idAccessory = 0;

    public static int generateIdFlower() {
        idFlower++;
        return idFlower;
    }

    public static int generateIdAccessory(){
        idAccessory++;
        return idAccessory;
    }
}
