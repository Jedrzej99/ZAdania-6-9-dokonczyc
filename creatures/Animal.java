package creatures;


public class Animal   {
    public final String species;
    public String name;
    public Double weight;

    public Boolean isAlive;
    public Animal(String species){
        this.isAlive = true;
        this.species = species;

    }

    public void feed() {
        if (this.isAlive){
            this.weight = this.weight + 0.5;
            System.out.println("mniam dzięki");
        } else{
            System.out.println("nie karm trupa");
        }
    }
    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight = this.weight - 0.5;
            System.out.println("zwierzę zdechło");
            if (this.weight <=0) {
                this.isAlive = false;
                System.out.println("zwierzę zostało zagłodzone");
            }
        } else {
            System.out.println("policja została wezwana");
        }
    }
    public String toString(){
        return species+" "+name+" "+weight+" "+isAlive;
    }



}
