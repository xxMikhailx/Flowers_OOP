package by.bsu.flowers.entity;

import by.bsu.flowers.exception.FlowerException;
import org.apache.log4j.Logger;

/**
 * Created by Михаил on 24.11.2015.
 */
public class MeadowFlower extends AbstractFlower {

    private static Logger LOG = Logger.getLogger(MeadowFlower.class);

    private int growth;

    public MeadowFlower(String name, String color, int price, int length, int growth) throws FlowerException {
        super(name,color,price,length);
        if (growth < 0 || growth > 100){
            throw new FlowerException("Growth can not be less then 1% or more then 100%.");
        }
        this.growth = growth;
    }

    public int getGrowth() {
        return growth;
    }

    @Override
    public String toString(){
        return "Flower: " + this.getName() +
                ". Color: " + this.getColor() +
                ". Price: " + this.getPrice() +
                ". Length: " + this.getLength() +
                ". Growth: " + this.growth + "%.";
    }
}
