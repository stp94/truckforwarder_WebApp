package pl.stp94.truckforwarder.models.trucks;

import pl.stp94.truckforwarder.interfaces.ITruck;
import org.springframework.stereotype.Component;

@Component
public class TipperTruck implements ITruck {
    final String name = "Wywrotka";
    final String loading = "Gora/Bok";
    final double length = 13.60;
    final double width = 2.45;
    final double height = 2.6;
    final double weight = 25;
    final double capacity = 33;
    final double price = 45000;

    public TipperTruck() {
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


