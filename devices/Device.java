package devices;

public abstract class Device {

    public String model;

    public String producer;

    public double year;
    public String toString(){
        return model+" "+producer+" "+year;
    }
     public abstract void turnOn();





}
