package cn.ks.kd.headfirst;


import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationcells;
    public void setLocationcells(ArrayList<String> aloc){
        locationcells = aloc;
    }
    public String checkYouself(String userInput){

        String result = "MISS";

        int index = locationcells.indexOf(userInput);
        if (index >= 0){
            locationcells.remove(index);
            if(locationcells.isEmpty()){
                result = "KILL";
            }else{
                result = "HIT";
            }
        }
        return  result;
    }

}
