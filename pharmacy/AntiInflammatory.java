package pharmacy;

public class AntiInflammatory extends Component{

    public AntiInflammatory(String name, int power, String weight) {
        super(name, power, weight);
    }

    public AntiInflammatory(String weight) {
        this("Противовоспалительное", 10, weight);
    }
}
