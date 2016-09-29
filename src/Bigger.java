/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Jindal
 */
public class Bigger {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        int y=Integer.parseInt(br.readLine());
        
        //int x=sc.nextInt();
        //int y=sc.nextInt();
        if(x>y){
            System.out.println("greater"+x);
        }
        else{
            System.out.println("greater"+y);
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
