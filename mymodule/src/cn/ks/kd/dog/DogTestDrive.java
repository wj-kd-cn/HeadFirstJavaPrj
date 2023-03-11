package cn.ks.kd.dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.size = 40;
        d1.bark();
        int i = 0;
        Dog[] olddogs = new Dog[10];
        olddogs[0] = new Dog();
        olddogs[0].name = "olddog1";
        olddogs[1] = new Dog();
        olddogs[1].name = "olddog2";
        olddogs[2] = new Dog();
        olddogs[2].name = "olddog3";
        olddogs[3] = new Dog();
        olddogs[3].name = "olddog4";
        olddogs[4] = new Dog();
        olddogs[4].name = "olddog5";
        olddogs[5] = new Dog();
        olddogs[5].name = "olddog6";
        olddogs[6] = new Dog();
        olddogs[6].name = "olddog7";
        olddogs[7] = new Dog();
        olddogs[7].name = "olddog8";
        olddogs[8] = new Dog();
        olddogs[8].name = "olddog9";
        olddogs[9] = new Dog();
        olddogs[9].name = "olddog10";
        while(true){
            if(i < 10){
                olddogs[i].bark();
                i = i + 1;
            }else{
                break;
            }

        }
    }
}
