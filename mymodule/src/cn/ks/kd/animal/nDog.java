package cn.ks.kd.animal;

public class nDog extends abCanine{

    private String name;

    public void setName(String aname){
        name = aname;
    }
    public String getName(){
        return name;
    }
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
