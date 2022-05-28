package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Copac> listaCopaci = new ArrayList<>();
        Copac copac = new Copac("rotunda", 9, "maro", "stejar", new Locatie(9,3));
        listaCopaci.add(copac);

        Copac copac1 = copac.clone();
        Copac copac2 = copac.clone();
        copac2.planteaza(new Locatie(6,6));
        listaCopaci.add(copac2);
        copac1.planteaza(new Locatie(7,9));
        listaCopaci.add(copac1);
        System.out.println(listaCopaci);
    }
}
