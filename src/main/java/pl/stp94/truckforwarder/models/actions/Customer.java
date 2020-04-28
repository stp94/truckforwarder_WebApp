package pl.stp94.truckforwarder.models.actions;

import pl.stp94.truckforwarder.interfaces.ICargo;
import pl.stp94.truckforwarder.interfaces.ICustomer;

public class Customer implements ICustomer {
    long customerID;
    String customerName;
    String customerSource;
    String customerDestination;
    ICargo customerCargo;
    long customerReward;




    @Override
    public long getID() {
        return customerID;
    }

    @Override
    public String getName() {
        return customerName;
    }

    @Override
    public String getSource() {
        return customerSource;
    }

    @Override
    public String getDestination() {
        return customerDestination;
    }

    @Override
    public ICargo getCargo() {
        return customerCargo;
    }

    @Override
    public long getReward() {
        return customerReward;
    }
}
