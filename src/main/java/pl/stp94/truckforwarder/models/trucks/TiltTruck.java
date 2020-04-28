package pl.stp94.truckforwarder.models.trucks;

import pl.stp94.truckforwarder.interfaces.ITruck;
import org.springframework.stereotype.Component;

@Component
public class TiltTruck implements ITruck {
    final String name = "Plandeka";
    final String loading = "Tyl/Bok";
    final double length = 7.40;
    final double width = 2.45;
    final double height = 3;
    final double weight = 5;
    final double capacity = 12;
    final double price = 10000;

    public TiltTruck() {
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
