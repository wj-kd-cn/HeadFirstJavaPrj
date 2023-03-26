package cn.ks.kd.animal;

public class Cat extends Animal{
    public static void main(String[] args) {
        Cat acat = new Cat();
        acat.setFood("meat");
        acat.eat();
    }
}
