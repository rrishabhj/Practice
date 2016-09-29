package practice;

import java.util.Arrays;

public class ArrayJagged {
    public static void main(String[] args) {
        int[][] arr=new int[4][];
        arr[0]=new int[4];
        arr[1]=new int[3];
        arr[2]=new int[2];
        arr[3]=new int[1];
        Arrays.fill(arr[0], 0);
        Arrays.fill(arr[1], 1);
        Arrays.fill(arr[2], 2);
        Arrays.fill(arr[3], 3);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("a["+i+"]["+j+"]:"+arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
