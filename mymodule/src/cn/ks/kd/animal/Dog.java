package cn.ks.kd.animal;

public class Dog extends Canine{
    public static void main(String[] args) {
        Dog adg = new Dog();
        adg.makeNoise();
        adg.setFood("bone");
        adg.eat();
    }
}
