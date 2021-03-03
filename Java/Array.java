/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int [][] Array = new int[5][8];
        for(int i=0; i < Array.length; i++){
            for(int j=0; j < Array[i].length; j++){
                Array[i][j]=((int)(Math.random()*198)-99);
                System.out.print(Array[i][j]+" ");
            }
            System.out.println(" ");
        }
        int max=Array[0][0];
        for(int i=0; i < Array.length; i++){
            for(int j=0; j < Array[i].length; j++){
                if(Array[i][j] > max) 
                	max=Array[i][j];
            }
        }
        System.out.println("Maximum array element value: "+max);
	}
}