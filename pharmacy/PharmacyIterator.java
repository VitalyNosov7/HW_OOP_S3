package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PharmacyIterator implements Iterator<Component> {
    private List<Component> components;
    private int index;

    public PharmacyIterator() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < components.size();
    } // проверяем, есть ли следующий элемент

    @Override
    public Component next() {
        return components.get(index++);
    } // отвечает за то, чтобы показать следующий компонент.
}
