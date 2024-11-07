package co.edu.umanizales.model;


public class Eagle implements BreatheAble,FlyAble,TerrestrialAble {
    @Override
    public void breathe() {
        System.out.println("Eagle breathe");

    }

    @Override
    public void fly() {
        System.out.println("Eagle fly");

    }

    @Override
    public void terrestrial() {
        System.out.println("Eagle terrestrial");

    }
}
