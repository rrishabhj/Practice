package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

    public static void main(String[] args) {
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        float p=Float.parseFloat(br.readLine());
        float r=Float.parseFloat(br.readLine());
        int t=Integer.parseInt(br.readLine());
            System.out.println(p*r*t/100);
        }catch(IOException e){
            e.printStackTrace();
                    
        }
    }
}
