package pharmacy;

public class Valeriana extends Component{
    public Valeriana(String name, int power, String weight) {
        super(name, power, weight);
    }

    public Valeriana(String weight) {
        this("Валериана", 10, weight);
    }
}
