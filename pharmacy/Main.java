package pharmacy;

import java.util.*;

public class   Main {
    public static void main(String[] args) {
        Pharmacy catPharmacy = new CatPharmacy();
        Component pen = new Penicilium("5 мг");
        pen.setWeight("7 мг");
        catPharmacy.addComponent(new Azitronitum("12 мг"))
                .addComponent(new Water("10 мл"))
                .addComponent(pen);
        Pharmacy catPharmacy1 = new CatPharmacy();

        catPharmacy1.addComponent(new Azitronitum("15 мг"))
                .addComponent(pen);

        Pharmacy catPharmacy2 = new CatPharmacy();

        catPharmacy2.addComponent(new Azitronitum("15 мг"))
                .addComponent(new Water("10 мл"));

        Pharmacy catPharmacy3 = new CatPharmacy();

        catPharmacy3.addComponent(new Valeriana("100"))
                    .addComponent(new Water("50"))
                    .addComponent(new Valeriana("100"));

        Pharmacy catPharmacy4 = new CatPharmacy();

        catPharmacy4.addComponent(new AntiInflammatory("100"))
                .addComponent(new Water("50"))
                .addComponent(new Valeriana("100"));




        List<Pharmacy> pharmacyList = new ArrayList<>();
        pharmacyList.add(catPharmacy2);
        pharmacyList.add(catPharmacy);
        pharmacyList.add(catPharmacy1);
        pharmacyList.add(catPharmacy3);
        pharmacyList.add(catPharmacy4);
        System.out.println(pharmacyList);

        System.out.println("========================================================");

       Set<Pharmacy> result = new HashSet<>(pharmacyList);

        System.out.println(result);

    }
}
