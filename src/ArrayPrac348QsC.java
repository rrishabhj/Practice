//smallest number in a array using radom numbers


package practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayPrac348QsC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[25];
        Random random=new Random();
        for(int i=0;i<a.length;i++){
            a[i]=random.nextInt(1000);
        }
        for(int i=0;i<a.length;i++){
            System.out.println("arr["+i+"]:"+a[i]);
        }
        int tempmin = a[0];
        int index=0;
        for(int i=1;i<a.length;i++){
            if(tempmin>a[i]){
                tempmin=a[i];
                index=i;
            }
        }
        System.out.println("a["+index+"]:"+a[index]);
    }
    
}
