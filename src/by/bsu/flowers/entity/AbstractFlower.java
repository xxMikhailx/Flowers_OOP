package by.bsu.flowers.entity;

import by.bsu.flowers.exception.FlowerException;
import by.bsu.flowers.utility.IdGenerator;
import org.apache.log4j.Logger;

/**
 * Created by Михаил on 24.11.2015.
 */
public abstract class AbstractFlower {

    private static Logger LOG = Logger.getLogger(AbstractFlower.class);

    private int id;
    private String name;
    private String color;
    private int price;
    private int length;

    public AbstractFlower(String name, String color, int price, int length) throws FlowerException {
        super();
        this.id = IdGenerator.generateIdFlower();
        if (name.isEmpty()){
            throw new FlowerException("Name can not be null.");
        }
        this.name = name;
        if (color.isEmpty()){
            throw new FlowerException("Color can not be null.");
        }
        this.color = color;
        if (price < 0) {
            throw new FlowerException("Price can not be less then 0.");
        }
        this.price = price;
        if (length < 0) {
            throw new FlowerException("Length can not be less then 0.");
        }
        this.length = length;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }
}
