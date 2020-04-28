package pl.stp94.truckforwarder.models.cargos;

import pl.stp94.truckforwarder.interfaces.ICargo;

public class FluidCargo implements ICargo {

    String type;
    double size;
    double capacity;

    public FluidCargo(String type, double capacity) {
        this.type = type;
        this.size = capacity;
    } // Size for FluidCargo is Capacity

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getSize() {
        return size;
    }
}
