package regex;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovingJunk {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String regex="(IMG)[_|-](\\d*)[_|-](\\d*)";
        Pattern p=Pattern.compile(regex);
        String dest=sc.nextLine();
        String source=sc.nextLine();
        File destinationFolder = new File(dest);
        File sourceFolder = new File(source);

        if (!destinationFolder.exists())
        {
            destinationFolder.mkdirs();
        }

        if (sourceFolder.exists() && sourceFolder.isDirectory())
        {
            File[] listOfFiles = sourceFolder.listFiles();

        if (listOfFiles != null)
        {
            for (File child : listOfFiles )
            {
                Matcher m=p.matcher(child.getName());
                
                if(m.find()&&child.length()/1024<500.0f){
                child.renameTo(new File(destinationFolder + "\\" + child.getName()));
                }
            }
                

            //to delete the source folder 
            //sourceFolder.delete();
        }
    }
    else
    {
        System.out.println(sourceFolder + "  Folder does not exists");
    }
    }
 }
    

