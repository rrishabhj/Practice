package strings;
public class StringPage380QsD {
    public static void main(String[] args) {
        String str[]={  "rishabh",
                        "ankit",
                        "priti",
                        "neha"};
        String temp;
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
        for(String st:str){
            System.out.println(st);
        }
    }
    
}
