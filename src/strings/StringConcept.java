package strings;
public class StringConcept {
    public static void main(String[] args) {
        String str1=new String("my name is jindal,rishabh jindal");
        String str2=new String("jindal");
        
        //equals method is used to chk contents are equal or not
        if(str1.equals(str2))               
            
        System.out.println("equal");      
        else                              
        System.out.println("not");
        //str1=str1.replaceAll("in", "3.14");
        str1=str1.replaceFirst("in", "3.14");
        System.out.println("str1:"+str1);
        //use of split function
        String strsplit="what is blue+yellow?/green";
        String str[]=strsplit.split("/");
        for(String st:str){
            System.out.println(st);
            
    }
    }
}
