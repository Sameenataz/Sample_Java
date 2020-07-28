package Java_Progs;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        int year = 1980;
        String winner = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year to know the world cup winner");
        year = sc.nextInt();

        // switch statement to check winner
        switch (year) {
            case 1983:
                winner = "India";
                break;
            case 1987:
                winner = "Australia";
                break;
            case 1992:
                winner = "Pakistan";
                break;

            case 1996:
                winner = "Sri Lanka";
                break;
            case 1999:
                winner = "Australia";
                break;
            case 2003:
                winner = "Australia";
                break;
            case 2007:
                winner = "Australia";
                break;
            case 2011:
                winner = "India";
                break;
            case 2015:
                winner = "Australia";
                break;
            case 2019:
                winner = "England";
                break;

            default:
                winner = "Wordld Cup is not Conducted on this year";
                break;
        }
        System.out.println("The Cricket World Cup winner is: " + winner);
    }
}
