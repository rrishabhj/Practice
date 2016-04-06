package strings;

import java.util.Scanner;

public class StringPage380QsC {
    public static void main(String[] args) {
        String str[]={"we will teach you how to....",
                        "move a mountain",
                        "level a building",
                        "erase th past",
                        "make a million",
                        "....all through java!"
                     };
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        for(int i=0;i<str.length;i++){
            str[i]=str[i].replace(str1, str2);
        }
        for(String st:str){
            System.out.println(st);
        }
            
            
            
    }
    
}
