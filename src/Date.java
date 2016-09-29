/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rishabh
 */
public class Date {
    public static void main(String[] args) throws InterruptedException {
        //java.util.Date date=new java.util.Date();
        Calendar c = Calendar.getInstance();
        System.out.println("Current time => " + c.getTime());

        SimpleDateFormat df1 = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate1 = df1.format(c.getTime());
        Thread.sleep(1000);
        SimpleDateFormat df2 = new SimpleDateFormat("h:mm:ss A");
        String formattedDate2 = df2.format(c.getTime());
        
        try {
            java.util.Date start=df2.parse(formattedDate2);
            System.out.println(start.toString());
        } catch (ParseException ex) {
            Logger.getLogger(Date.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(formattedDate1);
        System.out.println(formattedDate2);
        System.out.println("6:09:34 AM");
        if( formattedDate2.compareTo("6:09:34 AM")<0){
            System.out.println("yeah!");
        }else{
            System.out.println("dafs");
        }
        
    }
    
}
