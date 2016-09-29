
package practice;

class Sample{
    private int i;
    private float f;
    
    Sample(){
        System.out.println("babababaaaaabba");
    }
    Sample(int ii,float ff){
        i=ii;
        f=ff;
    }
    void show(){
        System.out.println("i:"+i+"f="+f);
    }
}
public class ArrayPrac2 {
    public static void main(String[] args) {
        Sample s[]=new Sample[3];
        s[0]=new Sample();
        s[1]=new Sample();
        s[2]=new Sample();
        
    }
}
