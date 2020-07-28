package Java_Progs;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        int i,m=0,flag=0;
        int prime;
        String winner = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check wether it is prime or not");
        prime = sc.nextInt();
        m=prime/2;
        if(prime==0||prime==1){
            System.out.println(prime+" is not prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(prime%i==0){
                    System.out.println(prime+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(prime+" is prime number"); }
        }
    }
}
