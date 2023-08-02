package trailingzerosinfactorial;

import java.util.Scanner;

public class TrailingZerosInAFactorial {

    private static int trailingZeros(int num){
        int res=0;
        int powerOf5=5;
        while (num>=powerOf5){
            res=res+(num/powerOf5);
            powerOf5=powerOf5*5;
        }
        return res;
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Please Enter a Number: ");
        System.out.println("Trailing Zeros Count: "+trailingZeros(scanner.nextInt()));

    }
}
