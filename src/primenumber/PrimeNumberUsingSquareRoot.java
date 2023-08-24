package primenumber;

import java.util.Scanner;

public class PrimeNumberUsingSquareRoot {
    private static boolean isPrime(int num){
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number ");
        int num=scanner.nextInt();
        if (isPrime(num)){
            System.out.println(num+ " is a prime number!! ");
        }else {
            System.out.println(num+ " is not a prime number!! ");
        }
    }
}
