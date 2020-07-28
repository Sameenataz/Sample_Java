package Java_Progs;

import java.util.Scanner;

public class Palindrome {


    static boolean isPalindrome(String str)
    {

        int i = 0, j = str.length() - 1;


        while (i < j) {


            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }


        return true;
    }

    // Main Function
    public static void main(String[] args)
    {
        String str = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string/number to be checked for Palindorme");
        str = sc.nextLine();
        if (isPalindrome(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
