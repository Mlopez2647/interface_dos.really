package co.edu.umanizales.model;

public class Lion implements TerrestrialAble,BreatheAble,SwimAble {

    @Override
    public void breathe() {
        System.out.println("Lion breathe");

    }

    @Override
    public void swim() {
        System.out.println("Lion swim");

    }

    @Override
    public void terrestrial() {
        System.out.println("Lion terrestrial");

    }
}
