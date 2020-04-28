package pl.stp94.truckforwarder.interfaces;

public interface ITruck {

    public int getID();
    public String getName();
    public String getLoading();
    public double getLength();
    public double getWidth();
    public double getHeight();
    public double getWeight();
    public double getCapacity();
    public double getPrice();

    public boolean setStatus();





}
