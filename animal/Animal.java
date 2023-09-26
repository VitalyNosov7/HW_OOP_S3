package animal;

import clinic.Illable;

import java.time.LocalDate;
import java.util.List;

public class Animal implements Illable {
    private String name;
    private double weight;
    private Owner owner;
    private LocalDate birthDay;
    private List<Vaccination> vaccinations;
    private Color color;
    private final String TYPE = this.getClass().getSimpleName();
    private  Boolean flyingAnimal;
    //private Boolean swimmingAnimal;
   

    public Animal(
                String name,
                double weight,
                Owner owner,
                LocalDate birthDay,
                List<Vaccination> vaccinations,
                Color color,
                Boolean flyingAnimal
                ) {
        this.name = name;
        this.weight = weight;
        this.owner = owner;
        this.birthDay = birthDay;
        this.vaccinations = vaccinations;
        this.color = color;
        this.flyingAnimal = flyingAnimal;
       
    }

    public Animal(
                String name,
                double weight,
                Owner owner,
                LocalDate birthDay,
                Color color,
                Boolean flyingAnimal
                ) {
                this(name, weight, owner, birthDay, null, color, flyingAnimal);
    }

    public Animal(String name) {
        this.name = name;
    }


    public void lifeCycle() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    private void toGo() {
        
        System.out.println(this.TYPE + " двигается.");
    }

    public void fly() {
        if(this.flyingAnimal != false){
            System.out.println(this.TYPE + " летает.");
        }else{
            System.out.println(this.TYPE + " летать не способен!");
        }
    }

    private void swim() {
        System.out.println(this.TYPE + " плавает.");
    }

    private void wakeUp() {
        System.out.println(this.TYPE + " проснулся.");
    }

    private void findFood() {
        System.out.println(this.TYPE + " ищет еду.");
    }

    private void eat() {
        System.out.println(this.TYPE + " кушает.");
    }

    private void toPlay() {
        System.out.println(this.TYPE + " играет.");
    }

    private void goToSleep() {
        System.out.println(this.TYPE + " собирается спать.");
    }

    public void sound() {
        System.out.println(this.TYPE + " издает звук.");
    }

    // getters
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public List<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }

    @Override
    public void heal() {
        System.out.println("Ветеринар лечит " + this.TYPE);
    }
}
