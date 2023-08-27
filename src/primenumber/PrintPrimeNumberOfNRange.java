package primenumber;

import java.util.Scanner;

public class PrintPrimeNumberOfNRange {

    private static boolean isPrime(int num){
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

    private static void printPrimes(int num){
        for (int i=2;i<=num;i++){
            if (isPrime(i))
                System.out.println(i);
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a Number ");
        int num=scanner.nextInt();
        printPrimes(num);
    }
}
