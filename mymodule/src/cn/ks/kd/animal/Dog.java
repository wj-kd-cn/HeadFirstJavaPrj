package cn.ks.kd.animal;

public class Dog extends Canine{
    private String name;

    public void setName(String aname){
        name = aname;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Dog adg = new Dog();
        adg.makeNoise();
        adg.setFood("bone");
        adg.eat();

    }
}
