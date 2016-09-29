package practice;

import java.util.Scanner;

public class ArrayPage348QsB {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
            arr[i]=sc.nextInt();
        }
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            if(arr[i]!=arr[j]){
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("palindrome");
        }
    }
    
}
