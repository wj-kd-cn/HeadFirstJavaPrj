package cn.ks.kd.animal;

public class nDog extends abCanine{
    @Override
    public void eat() {
        System.out.println("bone and bone");
    }

    @Override
    public void makeNoise() {
        System.out.println("Hoo Hoo Hoo");
    }

    @Override
    public void walking() {
        System.out.println("here to there");
    }

    public static void main(String[] args) {
        nDog andg = new nDog();
        andg.eat();
        andg.makeNoise();
        andg.walking();

    }
}
