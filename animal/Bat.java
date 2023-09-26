package animal;

import java.time.LocalDate;
import java.util.List;

public class Bat extends Animal {

    private String breed;

    public Bat(String name,
            double weight,
            Owner owner,
            LocalDate birthDay,
            List<Vaccination> vaccinations,
            Color color,
            Boolean flyingAnimal,
            String breed) {
        super(name, weight, owner, birthDay, vaccinations, color, flyingAnimal = true);
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }
}
