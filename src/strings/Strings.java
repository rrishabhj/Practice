package strings;

//conceptual 
public class Strings {
    public static void main(String[] args) {
        
        String str1=new String("jindal");
        String str2=new String("jindal");
        if(str1==str2)
        System.out.println("equal");            //here the memory of both strings are allocated @ diff parts
        else                                    //so they are not equal
        System.out.println("not");
        
        String str3="jindal";
        String str4="jindal";
        if(str3==str4)
        System.out.println("equal");      //same chunk of memory is allocated to str4 so equal
        else                              
        System.out.println("not");

    }
    
}
