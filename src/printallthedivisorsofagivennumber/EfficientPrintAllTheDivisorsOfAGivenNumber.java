package printallthedivisorsofagivennumber;

import java.util.Scanner;

public class EfficientPrintAllTheDivisorsOfAGivenNumber {

    private static void printDivisorsOfNumber(int num){
//        for (int i=1; i<=Math.sqrt(num);i++){
////            if (num%i==0){
////                System.out.print(i+" ");
////                if (i!=num/i)
////                System.out.print(num/i+" ");
////            }
////        }
        int i=0;
        for (i=1; i<=Math.sqrt(num);i++){
            if (num%i==0){
                System.out.print(i+" ");
            }
        }
        for (;i>=1;i--){
            if (num%i==0 && num/i!=i)
                System.out.print(num/i+" ");
        }


    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter a number: ");
        int num=scanner.nextInt();
        printDivisorsOfNumber(num);
        System.out.println("Divisors of " + num + " are :");
    }
}
