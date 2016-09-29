
package practice;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class Sort {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        try{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int[] arr=new int[t];
        for(int i=0;i<t;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Sort {
    public static void main(String[] args) throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
         int nbCases= Integer.parseInt(in.readLine());
         int[] iTab=new int[nbCases];
		while((nbCases--)>0)
		{
			iTab[nbCases]=Integer.parseInt(in.readLine());
		}
		Arrays.sort(iTab);
		StringBuffer o = new StringBuffer("");
		int i;
		for(i=0;i<iTab.length-1;i++){o.append(iTab[i]).append('\n');}
		o.append(iTab[i]);
		System.out.println(o);
		System.exit(0);
    }
} 