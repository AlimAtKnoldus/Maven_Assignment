import java.util.Scanner;
import java.lang.*;

public class Application {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Calculator calculator = new Calculator();
        /*Calculator Command Line Structure*/
        System.out.println("Calculator App \n"
                           + "1) Addition \n"
                           + "2) Subtraction \n"
                           + "3) Multiplication \n"
                           + "4) Division"
        );
        System.out.println("Press (1 to 4) for calculation");
        /*Specific arithmetic operation will be performed according to user input*/
        int number=s.nextInt();
        /*If user input is correct, user can proceed to enter firstValue and secondValue */
        if (number>0 && number<5) {
            System.out.println("Enter Two Numbers");
            int firstValue=s.nextInt();
            int secondValue= s.nextInt();
            s.nextLine();
            /*Print output*/
            switch(number)
            {
                case 1:System.out.println("Answer = " +calculator.addition(firstValue,secondValue));
                    break;
                case 2:System.out.println("Answer = " +calculator.subtraction(firstValue,secondValue));
                    break;
                case 3:System.out.println("Answer = " +calculator.multiplication(firstValue,secondValue));
                    break;
                case 4:System.out.println("Answer = " +calculator.division(firstValue,secondValue));
                    break;
            }
        }
        /* If user input is incorrect, user can not proceed */
        else{
            System.out.println("Invalid option");
        }
        s.close();
    }
}