package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {
       
        // String to be scanned to find the pattern.
      String line = "this order was placed for QT3000! OK?";
      String line2="IMG-20150706_23190";
      String line3[]={"happy birthday","fuck you","this is a test"};
      String pattern = "(.*)(\\d+)(.*)";
      String pattern2="(IMG)[_|-](\\d*)[_|-](\\d*)";

      String pattern3="(.*)(birthday)(.*)";
      // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
        Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) );
      } else {
         System.out.println("NO MATCH");
      }
      
      r=Pattern.compile(pattern2);
      m=r.matcher(line2);
      if(m.find()){
          System.out.println(m.matches());
          System.out.println(m.lookingAt());
      }else{
          System.out.println("thullu");
      }
      r=Pattern.compile(pattern3);
      for(String str:line3){
          
          m=r.matcher(str);
          if(m.find())
          System.out.println(m.group(0));
      }
      
    }
    
}
