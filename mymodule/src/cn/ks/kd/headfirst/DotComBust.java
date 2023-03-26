package cn.ks.kd.headfirst;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper gh = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numGuess = 0;

    public void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        DotCom three = new DotCom();
        two.setName("eToys.com");
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms!");
        System.out.println("Pets.com and eToys.com and Go2.com");

        for(DotCom adc:dotComsList){


        }


    }
}
