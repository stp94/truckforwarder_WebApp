package pl.stp94.truckforwarder.models.trucks;

import pl.stp94.truckforwarder.interfaces.ITruck;
import org.springframework.stereotype.Component;

@Component
public class StandardTruck implements ITruck {
    final String name = "Standard";
    final String loading = "Tyl";
    final double length = 13.60;
    final double width = 2.48;
    final double height = 2.8;
    final double weight = 24;
    final double capacity = 33;
    final double price = 35000;

    public StandardTruck() {
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLoading() {
        return loading;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean setStatus() {
        return false;
    }
}
