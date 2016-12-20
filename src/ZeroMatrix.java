/**
 * Created by akshayrajdayal on 12/7/16.
 */


import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class ZeroMatrix {

    public static void main(String[] args) {

        int matrix[][] = {{1,2,3},{4,0,6},{0,7,8},{9,10,11}};
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }

        int row=0,col=0;

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    row|=(1<<i);
                    col|=(1<<j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if( ((1<<i) & row) >0 || ((1<<j) & col ) > 0){
                    matrix[i][j]=0;
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }


    }
}

