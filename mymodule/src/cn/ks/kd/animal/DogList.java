package cn.ks.kd.animal;

public class DogList {
    private nDog[] dogs = new nDog[50];
    private int nextIndex = 0;

    public void add(nDog vdog){
        if (nextIndex < dogs.length){
            dogs[nextIndex] = vdog;
            System.out.println("add a " + vdog.getType() + " it's name: " + vdog.getName() + " ，location: " + Integer.toString(nextIndex));
            nextIndex = nextIndex + 1;
        }else{
            System.out.println("DogList is overflow ! cannnot add new dog");
        }

    }

    public static void main(String[] args) {
        nDog adog = new nDog();
        adog.setName("Jerry");
        adog.setType("DOG");
        DogList adoglst = new DogList();
        adoglst.add(adog);
    }
}
