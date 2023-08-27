package primenumber;

import java.util.Scanner;

public class OptimizedFindPrimeNumber {

    private static boolean checkPrime(int num){

        if (num<=1)
            return false;
        if (num<=3)
            return true;
        if (num%2==0 || num%3==0)
            return false;
        for (int i=5;i<=Math.sqrt(num);i=i+6){
            if (num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=scanner.nextInt();
        if (checkPrime(num))
            System.out.println(num+ " is a prime number!!");
        else
            System.out.println(num+ " is not a prime number!!");
    }
}
