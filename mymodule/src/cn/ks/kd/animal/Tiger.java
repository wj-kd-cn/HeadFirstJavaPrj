package cn.ks.kd.animal;

public class Tiger extends Animal{
    public void eat(){
        System.out.println("eat a lot of food: " + food);
    }

    public static void main(String[] args) {
        Tiger atg = new Tiger();
        atg.setFood("goat");
        atg.eat();
    }
}
