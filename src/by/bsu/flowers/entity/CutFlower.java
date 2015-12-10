package by.bsu.flowers.entity;

import by.bsu.flowers.exception.FlowerException;
import org.apache.log4j.Logger;

/**
 * Created by Михаил on 24.11.2015.
 */
public class CutFlower extends AbstractFlower {

    private static Logger LOG = Logger.getLogger(CutFlower.class);

    private int freshness;

    public CutFlower(String name, String color, int price, int length, int freshness) throws FlowerException {
        super(name,color,price,length);
        if (freshness <= 0 || freshness > 100){
            throw new FlowerException("Freshness can not be less then 1% or more then 100%.");
        }
        this.freshness = freshness;

    }

    public int getFreshness() {
        return freshness;
    }

    @Override
    public String toString(){
        return "Flower: " + this.getName() +
                ". Color: " + this.getColor() +
                ". Price: " + this.getPrice() +
                ". Length: " + this.getLength() +
                ". Freshness: " + this.freshness + "%.";
    }


}
