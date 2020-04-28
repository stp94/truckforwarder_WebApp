package pl.stp94.truckforwarder.models.cargos;

import pl.stp94.truckforwarder.interfaces.ICargo;
public class EuroPaletteCargo implements ICargo {

    String type;
    double size;
    double height;

    public EuroPaletteCargo(String type, double height) {
        this.type = type;
        this.size = height;
    } // Size for EuroPaletteCargo is Height

    @Override
    public String getType() {
        return type;
    }

    @Override
    public double getSize() {
        return size;
    }
}
