/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;


/**
 *
 * @author Jindal
 */
public class Factorial {
    public static void main(String[] args) {
        
        int t,n; 
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-->0){
            BigInteger fact=new BigInteger("1");
            n=sc.nextInt();
            for(int i=n;i>0;i--){
                fact=fact.multiply(BigInteger.valueOf(i));
            }
            System.out.println(fact);
        }
        sc.close();
        /*try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t>0){
        BigInteger num=new BigInteger(br.readLine());
        BigInteger fact=new BigInteger("1");
        //System.out.println(num);
        //num.multiply(new BigInteger("5"));
       // System.out.println(num);
        while(num.compareTo(new BigInteger("0"))==1){
            fact=fact.multiply(num);
            num=num.subtract(new BigInteger("1"));
        }
        System.out.println(fact);
        }
        }catch(IOException e){
            e.printStackTrace();
        }
        /*int fact=1,num=sc.nextInt();
        for(int i=num;i>0;i--){
            fact*=i;
        }
        System.out.println(num+"!="+fact);
    */
    }
    
}
