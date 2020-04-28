package pl.stp94.truckforwarder.models.trucks;

import pl.stp94.truckforwarder.interfaces.ITruck;
import org.springframework.stereotype.Component;

@Component
public class TankTruck implements ITruck {
    final String name = "Cysterna";
    final String loading = "Gora";
    final double length = 13.40;
    final double width = 2.55;
    final double height = 3.7;
    final double weight = 34;
    final double capacity = 51;
    final double price = 45000;

    public TankTruck() {
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


