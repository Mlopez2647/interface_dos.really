package co.edu.umanizales.model;

public class Crocodile implements BreatheAble,SwimAble,TerrestrialAble {
    @Override
    public void breathe() {
        System.out.println("Crocodile is breathing");

    }

    @Override
    public void swim() {
        System.out.println("Crocodile is swimming");

    }

    @Override
    public void terrestrial() {
        System.out.println("Crocodile is terrestrial");

    }
}
