package pl.stp94.truckforwarder.models.others;

import pl.stp94.truckforwarder.interfaces.ICargo;
import pl.stp94.truckforwarder.models.cargos.*;


public class CargoJob {
    String source;
    String destination;
    ICargo cargo;

    public CargoJob(String source, String destination, ICargo cargo) {
        this.source = source;
        this.destination = destination;
        this.cargo = cargo;
    }


    public void CreateCargo(String input_type_of_cargo, String type, double size) {
        if (input_type_of_cargo == "EuroPalette") {
            cargo = new EuroPaletteCargo(type, size);
        }
        else if (input_type_of_cargo == "Fluid") {
            cargo = new FluidCargo(type, size);
        }
    }


}


