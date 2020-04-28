package pl.stp94.truckforwarder.interfaces;

public interface ICustomer {

    public long getID();
    public String getName();
    public String getSource();
    public String getDestination();
    public ICargo getCargo();
    public long   getReward();



}
