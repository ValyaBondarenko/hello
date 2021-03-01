/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int a;
int digit1, digit2, digit3;
a = 100 + (int) (Math.random()*899);
System.out.println("Случайно сгенерированное трёхзначное число: "+ a);
digit3 = a % 10;
digit2 = (a / 10) % 10;
digit1 = a / 100;
if(digit1>digit2 & digit1>digit3){
    System.out.println("Наибольшая цифра: "+ digit1);
}
else if(digit2>digit3 & digit2>digit1){
    System.out.println("Наибольшая цифра: "+ digit2);
}
else{
    System.out.println("Наибольшая цифра: "+ digit3);
}
	}
}

