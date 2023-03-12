package cn.ks.kd.headfirst;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] vlocs){
        locationCells = vlocs;

    }
    public String checkYourSelf(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for(int cell:locationCells){
            System.out.println("guess: " + guess);

            if (guess == cell){
                result = "hit";
                numOfHits = numOfHits + 1;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println("result: " + result);
        return result;

    }

}
