package strings;
public class SpecialStringPage380QsE {
    public static void main(String[] args) {
        /*StringBuilder sb[]=new StringBuilder[3];
         sb[0]=new StringBuilder("to err is human...");                                   
         sb[1]=new StringBuilder("to err is human...");                                   
         sb[2]=new StringBuilder("to err is human...");                                   
        }*/
        StringBuilder sb=new StringBuilder();
        
        String s[]={
                        "to err is human...",
                        "but to really thing up...",
                        "one needs to know java!!"};
        
        for(String str:s){
            String rev[]=str.split(" ");
            for(String revstr:rev){
                char ch[]=revstr.toCharArray();
                char temp;
                for(int i=0,j=revstr.length()-1;i<j;i++,j--){
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
                System.out.print(ch);
                System.out.print(" ");
                sb.append(ch);              //like poetry :)
                sb.append(" ");
            }
            sb.append("\n");
            System.out.println();
        }
        System.out.println(sb);
    }
    
}
