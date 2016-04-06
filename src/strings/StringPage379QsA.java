package strings;

import java.util.Scanner;

public class StringPage379QsA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int pos,len;
        pos=sc.nextInt();
        len=sc.nextInt();
        if(len==0){
            System.out.println("str:"+str);
        }else{
            System.out.println("str:"+str.substring(pos-1, pos+len-1        ));
        }
    }
    
}
