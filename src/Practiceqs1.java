/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author Jindal
 */
public class Practiceqs1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt();
        int sum=0;
        for(int i=x;i<=y;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("sum:"+sum);
    }
    
}
