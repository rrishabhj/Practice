package regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//applying regular expression in file strings
public class RegEx2 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(new File("D:\\threadDump-20160406-110506.txt"));
            while(sc.hasNext()){
                String str=sc.nextLine();
                String reg="\\b(java)(\\.)(.+)\\b";
                Pattern pattern=Pattern.compile(reg);
                Matcher matcher=pattern.matcher(str);
                if(matcher.find()){
                System.out.println(matcher.group(0));
                System.out.println("start:"+matcher.start());
                System.out.println("end:"+matcher.end());
            }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("eror");
        }
    }
    
}
