package co.edu.umanizales;

import co.edu.umanizales.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Duck sebastian = new Duck();
        Lion mufasa = new Lion();
        Crocodile roberto = new Crocodile();
        Eagle piolina = new Eagle();

        sebastian.fly();
        sebastian.breathe();
        sebastian.swim();
        sebastian.terrestrial();

        mufasa.terrestrial();
        roberto.terrestrial();
        piolina.terrestrial();

        mufasa.breathe();
        roberto.breathe();
        piolina.breathe();

        mufasa.swim();
        roberto.swim();

        piolina.fly();

    }
}