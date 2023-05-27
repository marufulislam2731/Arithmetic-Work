
package beginnerjava;

import java.util.Scanner;

public class ArithmeticWork {
    public static void main(String[] args){
    
        Scanner input= new Scanner(System.in);
        int num1, num2, result;
       System.out.print("Enter the first number: ");
       num1= input.nextInt();
       System.out.print("Enter the second number: ");
       num2= input.nextInt();
        
        result= num1+num2;
        System.out.println("Sum= "+result);
        result= num1-num2;
        System.out.println("Substitution= "+result);
        result= num1*num2;
        System.out.println("Multiplication= "+result);
        result= num1/num2;
        System.out.println("Divide= "+result);
        result= num1%num2;
        System.out.println("Reminder= "+result);
    }
    
}
