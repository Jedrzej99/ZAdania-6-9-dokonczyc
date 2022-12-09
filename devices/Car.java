package devices;

public class Car extends Device {
    public final String model;
    public final String producer;
    public double year;
    public double value;

    public Car(String model, String producer, Double year, Double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;


    }

    public void Car(Car nissan) {
    }
    public String toString(){
        return model+" "+producer+" "+year+" "+value;
    }
    public void turnOn(){

    }

}


