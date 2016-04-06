package strings;

public class ImpStringPage381QsH {
    public static void main(String[] args) {
        String s[]={
                        "Priti goyal gupta",
                        "Ankit akk jindal",
                        "Rishabh Choni Jindal"};
        StringBuilder sb=new StringBuilder();
        int i;
        for(String str:s){
            String st[]=str.split(" ");
            for(i=0;i<st.length-1;i++){
                sb.append(st[i].charAt(0));
                sb.append(".");
            }
            sb.append(st[i]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
    
}
