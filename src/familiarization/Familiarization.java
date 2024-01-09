/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familiarization;
import java.util.Scanner;
/**
 *
 * @author mikah
 */

public class Familiarization
{
    // Variables
    private static int numOne;
    private static int numTwo;
    private static int result;
    private static int num;
    private static boolean success;
    private static Scanner scan=new Scanner(System.in);
    
    public static void main(String args[])
    {
        // Functions called in Main
        arithmetic();
        compoundAssign();
        unary();
        relational();
        conditional();
    }
    // Each function called:
    private static void arithmetic()
    {
        System.out.println("************arithmetic**************");
        System.out.println("Enter an integer greater than 0:");
        numOne=scan.nextInt();
        System.out.println("Enter another integer greater than 0:");
        numTwo=scan.nextInt();

        if(numOne>0 && numTwo>0)
        {
          
            System.out.println(numOne+" + "+numTwo+" = "+(numOne+numTwo));
            System.out.println(numOne+" - "+numTwo+" = "+(numOne-numTwo));
            System.out.println(numOne+" * "+numTwo+" = "+(numOne*numTwo));
            System.out.println(numOne+" / "+numTwo+" = "+(numOne/numTwo));
            System.out.println(numOne+" % "+numTwo+" = "+(numOne%numTwo));
        }
        System.out.println("");
    }

    private static void compoundAssign()
    {
        System.out.println("************compoundAssign**************");
        System.out.println("Enter an integer greater than 0 :");
        numOne=scan.nextInt();
        System.out.println("Enter another integer greater than 0:");
        numTwo=scan.nextInt();

        result=numOne;

        if(numOne>0 && numTwo>0)
        {
           
            System.out.println("result "+result);
            System.out.println("result += numTwo = "+(result+=numTwo));
            System.out.println("result -= numOne = "+(result-=numOne));
            System.out.println("result *= numTwo = "+(result*=numTwo));
            System.out.println("result /= numOne = "+(result/=numOne));
            System.out.println("result %= numTwo = "+(result%=numTwo));

          
        }
        System.out.println("");
    }


    private static void unary()
    {
        System.out.println("************unary*************");
        System.out.println("Enter an integer greater than 0 :");
         num=scan.nextInt();

        if(num>0)
        {
           
            System.out.println("num-- = "+(--num));
            System.out.println("num++ = "+(++num));
            System.out.println("+num = "+num);
            System.out.println("-num = "+(-num));
            System.out.println("success = "+success);
            System.out.println("!success = "+!success);
        }
        System.out.println("");
    }


    private static void relational()
    {
        System.out.println("************relational*************");
        System.out.println("Enter an integer greater than 0 :");
         numOne=scan.nextInt();

         System.out.println("Enter another integer greater than 0:");
         numTwo=scan.nextInt();


        if(numOne>0 && numTwo>0)
        {
         
            if(numOne==numTwo)
            System.out.println("numone == numTwo");

            if(numOne!=numTwo)
            System.out.println("numone != numTwo");

            if(numOne>numTwo)
            System.out.println("numone > numTwo");

            if(numOne>=numTwo)
            System.out.println("numone >= numTwo");

            if(numOne<numTwo)
            System.out.println("numone < numTwo");

            if(numOne<=numTwo)
            System.out.println("numone <= numTwo");
            
        }
        System.out.println("");
    }


    private static void conditional()
    {
        System.out.println("************conditional*************");
        System.out.println("Enter an integer >=10 :");
         numOne=scan.nextInt();

         System.out.println("Enter an another integer >=10 :");
         numTwo=scan.nextInt();


        if(numOne>0 && numTwo>0)
        {
          
            if(numOne>=10  && numTwo>=10)
            System.out.println("numOne is >=10 AND numTwo is >=10");

            if(numOne>=10  || numTwo>=10)
            System.out.println("numOne OR numTwo >=10");
            
        }
        System.out.println("");
    }
}