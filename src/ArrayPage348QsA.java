package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPage348QsA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] arrev=new int[size];
        
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
            arr[i]=sc.nextInt();
            arrev[j]=arr[i];
        }
        for(int i:arrev){
            System.out.println(i);
        }
        
        
    }
    
}
