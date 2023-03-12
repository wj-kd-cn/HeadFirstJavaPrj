package cn.ks.kd.headfirst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameHelper {
    public String getUserInput(String prompt){
        String inputline = "";
        System.out.println(prompt + "   ");
        try{
            BufferedReader vbf = new BufferedReader(new InputStreamReader(System.in));
            inputline = vbf.readLine();
            if(inputline.length() == 0) return null;
        }catch (IOException e){
            System.out.println("IOException: " + e) ;

        }
        return inputline;

    }

}
