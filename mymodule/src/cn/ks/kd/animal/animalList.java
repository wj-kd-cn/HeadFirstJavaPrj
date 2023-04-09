package cn.ks.kd.animal;

public class animalList {
    private abAnimal[] animals = new abAnimal[50];
    private int nextIndex = 0;

    public void add(abAnimal ani){
        if(nextIndex < animals.length){
            animals[nextIndex] = ani;
            System.out.println("add a " + ani.getType() + "  loc: " + Integer.toString(nextIndex));
            nextIndex++;
        }

    }

    public static void main(String[] args) {
        nDog adog = new nDog();
        adog.setType("DOG");
        nCat acat = new nCat();
        acat.setType("CAT");
        animalList val = new animalList();
        val.add(adog);
        val.add(acat);

    }
}
