package Java_Progs;

import java.util.Scanner;

public class Numeric {

    public static void main(String...s)
    {
        String s1 = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value to check whether it is Numeroc or AlphaNumeric");
        s1 = sc.nextLine();

        if(s1.matches("[0-9]+")){
            System.out.println("The Value is Numeric");
        }
        else if(s1.matches("[a-zA-Z]+")){
            System.out.println("The Value is Alphabetic");
        }
        else if(s1.matches("[a-zA-Z0-9]+")){
            System.out.println("The Value is AlphaNumeric");
        }
        else{
            System.out.println("Invalid input");
        }


    }
}
