import creatures.Animal;
import devices.Car;


public class Main implements salleable {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.name = "Rex";
        dog.weight = 25.3;
        System.out.println("Masz psa, nazywa się:");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        Animal cat = new Animal("british");
        cat.name = "kot";
        cat.weight = 5.0;

        System.out.println("Masz kota, nazywa się:");
        System.out.println(cat.name);
        System.out.println(cat.isAlive);
        System.out.println(cat.species);

        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        System.out.println(cat.weight);
        cat.feed();
        cat.takeForAWalk();
        Car nissan = new Car("Juke", "nissan", 2022.0, 60000.0);
        Car nissan2 = new Car("Juke", "nissan", 2022.0, 60000.0);

        Human Jedrzej = new Human();
        Jedrzej.Name = "Jedrzej";
        Jedrzej.Surname = "Juskowiak";
        Jedrzej.car = nissan;
        Jedrzej.cash = 1000.0;
        System.out.println(Jedrzej.car.model);
        Jedrzej.setSalary(3500.8);
        Jedrzej.getSalary();
        Jedrzej.setCar(nissan);

        Car volkswagen = new Car("polo", "volkswagen",2002.0, 6000.0);

        if (nissan == nissan2){
            System.out.println("Auta są różne");
        }
        else {
            System.out.println("Samochody są te same");
        }
        System.out.println(nissan);
        System.out.println(nissan2);


        Human Damian = new Human();
        Damian.Name = "Damian";
        Damian.Surname = "Juskowiak";
        Damian.car = nissan2;
        Damian.cash = 1000.0;
        System.out.println(Damian.car.model);
        Damian.setSalary(3500.8);
        Damian.getSalary();
        Damian.setCar(nissan);
        salleable.sell(Damian, Jedrzej, 50);



    }


}



