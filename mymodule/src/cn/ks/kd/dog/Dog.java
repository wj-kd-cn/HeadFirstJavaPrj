package cn.ks.kd.dog;

public class Dog {
    String name;
    int size;
    String breed;

    void bark(){
        if (size > 60){
            System.out.println(name + "  Wooof Wooof !!!!");
        }else if (size > 20){
            System.out.println(name + "  Ruff Ruff !!!!");
        }else{
            System.out.println(name + "  Yip Yip !!!!");
        }

    }
}
