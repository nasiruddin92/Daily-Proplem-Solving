package printallthedivisorsofagivennumber;

import java.util.Scanner;

public class PrintAllTheDivisorsOfAGivenNumber {

    private static void findDivisorsOfNumber(int num){
        for (int i=1; i<=num;i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a Number: ");
        int num=scanner.nextInt();
        findDivisorsOfNumber(num);
        System.out.println("Divisors of " + num + " are :");
    }
}
