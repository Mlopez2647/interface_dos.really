package co.edu.umanizales.model;

public class Duck implements BreatheAble,FlyAble,SwimAble,TerrestrialAble{
    @Override
    public void breathe() {
        System.out.println("Duck breathe");

    }

    @Override
    public void fly() {
        System.out.println("Duck fly");

    }

    @Override
    public void swim() {
        System.out.println("Duck swim");

    }

    @Override
    public void terrestrial() {
        System.out.println("Duck terrestrial");

    }
}